package TestPackage;
public class B {
	String name;
	public static void show() {
		System.out.println("class B show");
	}
	public static void main(String ar[]) {
		A ob=new A("Khan");
		
		ob.show();
		/*
		B obj=new B();
		
		ob.name="Ali";
		ob.show();
		show();
	*/
		}
}
