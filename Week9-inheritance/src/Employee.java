
public class Employee {
	private String name;
	private char gender;
	protected void setName(String n) {
		name=n;
		System.out.println("SetName parent");
	}
	protected String getName() {return name;}
	protected void setGender(char g) {
		gender=g;
		System.out.println("this pointer "+this.toString());

	}
	protected char getGender() {return gender;}
}


