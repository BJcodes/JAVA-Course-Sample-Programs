package TestPackage;

public class A {

	String name;
	public A(String str) {
		name=str;
		System.out.println("Class A Constructor, variable is "+name);
		
	}
	public void show() {
		System.out.println("Class A Show: variable is"+this.name);

	}
}
