import java.util.Scanner;

public class Agemax {
	int age;
	public void setAge(int a) {age=a;}
	public int getAge() {return age;}
	public static int oldest(int a1,int a2,int a3) {
		int max;
		max=a1;
		if(max<a2) max=a2;
		if (max<a3) max=a3;
		return max;
	}
	public static void main(String arg[]) {
		
		Agemax p1,p2,p3;
		p1=new Agemax();
		p2=new Agemax();
		p3=new Agemax();
		Scanner input=new Scanner(System.in);
		int age;
		System.out.println("Enter age value");
		age=input.nextInt();
		p1.setAge(age);
		System.out.println("Enter age value");
		age=input.nextInt();
		p2.setAge(age);
		System.out.println("Enter age value");
		age=input.nextInt();
		p3.setAge(age);
		int maxage;
		maxage=oldest(p1.getAge(), p2.getAge()
				,p3.getAge());
		System.out.println("Oldest person of age "+maxage);
		
	}
	
}
