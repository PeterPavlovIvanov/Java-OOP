package prepExam;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {
	private String directoryName;
	private List<Subscriber> subscribers;
	PhoneWriter pw;
	
	//constructor by parameters
	PhoneDirectory(String directoryName, List<Subscriber> subscribers, PhoneWriter pw){
		this.directoryName = directoryName;
		this.subscribers = subscribers;
		this.pw = pw;
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
	
	//prints a list of subscribers whose names are equal to the given with the interface
	public void writeDataToFile(String subscriberName) {
		pw.writeData(getSubscribersByName(subscriberName));
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
