package prepExam;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory implements PhoneWriter {
	private String directoryName;
	private List<Subscriber> subscribers;
	
	//constructor by parametes
	PhoneDirectory(String directoryName, List<Subscriber> subscribers){
		this.directoryName = directoryName;
		this.subscribers = subscribers;
	}
	
	//returns a list of subscribers with whose names are equal to the given
	public List<Subscriber> getSubscribersByName(String subscriberName){
		List<Subscriber> equalNames = new ArrayList<>();

		for(int i = 0; i < this.subscribers.size(); i++) {
			if(this.subscribers.get(i).getName().equals(subscriberName)) {
				equalNames.add(this.subscribers.get(i));
			}
		}
		
		return equalNames;
	}
	
	//prints a list of subscribers with whose names are equal to the given with the interface
	public void printSubscribersByName(String subscriberName) {
		PhoneDirectory pd = new PhoneDirectory("Subscribers:"+subscriberName, this.getSubscribersByName(subscriberName));
		List<PhoneDirectory> ls = new ArrayList<>();
		ls.add(pd);
		writeData(ls);
	}
	
	//prints on the console data about the given list of directories
	@Override
	public void writeData(List toWrite) {
		for(int i = 0; i < toWrite.size(); i++) {
			PhoneDirectory pd = (PhoneDirectory) toWrite.get(i);
			System.out.print(pd.toString());
		}
	}
	
	//converts directory to String
	@Override
	public String toString() {
		String result = this.directoryName + ": [\n";
		for(int i = 0; i < this.subscribers.size(); i++) {
			Subscriber s = this.subscribers.get(i);
			result += s.toString();
		}
		result += "]\n";
		return result;
	}
}
