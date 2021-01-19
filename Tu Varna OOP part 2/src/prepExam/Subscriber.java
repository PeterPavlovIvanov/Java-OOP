package prepExam;

class Subscriber implements Comparable {

	private String name;
	private String number;
	
	//Constructor by parameters
	public Subscriber(String name, String number){
		this.name = name;
		this.number = number;
	}
	
	//checks for equal objects
	@Override
	public boolean equals(Object o) {
		if(this.name.equals(((Subscriber) o).getName()) && this.number.equals(((Subscriber) o).getNumber())) {
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
		String oNum = ((Subscriber)o).getNumber();
		return this.number.compareTo(oNum);
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
