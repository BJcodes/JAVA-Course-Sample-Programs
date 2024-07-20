
public class ScopeTest {

	private static int x=10;
	public static void showlocal() {
		
		int x=20;
		x=x+2;
		System.out.println("showlocal is "+x);
			
	}
	public  void showstatic(int a) {
		x=x+a;
		System.out.println("showstatic is "+x);
	}
	
	public void overload(int a) {
		System.out.println("   void overload(int a)  "+a);
		
	}
	public void overload(double a) {
		System.out.println("   void overload(double a)  "+a);
		
	}
	public void overload(int a, int b) {
		System.out.println("   void overload(int a, int b)  "+a+" "+b);
		
	}
	
	public void overload(int a, double b, double c) {
		System.out.println("   void overload(int a, float b,float c)  "+a+" "+b+" "+c);
		
	}
	
	public void overload(float a, float b) {
		System.out.println("   void overload(float a, float b)  "+a+" "+b);
		
	}
	
	public static void main(String arg[]) {
		ScopeTest t=new ScopeTest();
		ScopeTest t2=new ScopeTest();
		int x=5;
		System.out.println("main is "+x);
		showlocal();
		t2.showstatic(2);
		t2.showstatic(3);
		t2.showstatic(4);
		t.showstatic(-7);
		
		t.overload(10);
		t.overload(2.3);
		t.overload(3,4);
		t.overload(2,2.3,5.4);
		
		
	}
}
