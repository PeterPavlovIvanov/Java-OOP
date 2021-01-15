package prepExam;

import java.io.*;
import java.util.List;

class FileToConsole implements PhoneWriter {

	private String fileName;
	
	//Constructor by fileName
	FileToConsole(String fileName){
		this.fileName = fileName;
	}
	
	//Writes data to the file from given list of Subscribers
	@Override
	public void writeData(List toWrite) {
		
		File outFile = new File(this.fileName + ".txt");
		try {
			BufferedWriter bf = new BufferedWriter (new FileWriter(outFile));
			for(int i = 0; i < toWrite.size(); i++) {
				Subscriber s = (Subscriber) toWrite.get(i);
				bf.write(s.toString());
			}
			bf.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
