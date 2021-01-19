package prepExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Subscriber> subscribers = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			String number = "" + i * 22;
			Subscriber s = new Subscriber("name" + i, number);
			subscribers.add(s);
		}
		FileToConsole ftc = new FileToConsole("src/prepExam/data");
		PhoneDirectory dir = new PhoneDirectory("DirectoryName1", subscribers, ftc);
		System.out.println(dir.toString());
		System.out.println(dir.getSubscribersByName("name2"));
		dir.writeDataToFile("name1");
	}
}
