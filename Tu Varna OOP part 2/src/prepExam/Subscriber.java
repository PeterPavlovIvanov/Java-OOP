package prepExam;

class Subscriber implements Comparable {

	private String name;
	private String number;
	
	//Constructor by parameters
	Subscriber(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	//checks for equal objects
	@Override
	public boolean equals(Object o) {
		if(this.name == ((Subscriber) o).getName() && this.number == ((Subscriber) o).getNumber()) {
			return true;
		}
		return false;
	}
	
	//converts Subscriber to String
	@Override
	public String toString() {
		return String.format("Subscriber: [name: %s, number: %s]\n", this.name, this.number);
	}
	
	//Compares Subscribers
	@Override
	public int compareTo(Object o) {
		double n1 = Double.parseDouble(this.number);
		double n2 = Double.parseDouble(((Subscriber) o).getNumber());
		if(n1 == n2) {
			return 0;
		}else if(n1 > n2) {
			return 1;
		}else {
			return -1;
		}
	}

	
	//Getters and Setters
	public String getName() {
		return this.name;
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
