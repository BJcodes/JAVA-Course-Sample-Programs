import java.util.Scanner;

public class Test {

	public static void main(String arg[]) {
		Rectangle rec=new Rectangle();
		rec.setHeight(4);
		rec.setWidth(2);
		System.out.println("Parameter of the Rectangle is "+rec.parameter());
		System.out.println("Area of the Rectangle is "+rec.area());
		Rectangle rec1=new Rectangle();
		System.out.println("Parameter of the Rectangle is "+rec1.parameter());
		System.out.println("Area of the Rectangle is "+rec1.area());
		Rectangle rec2=new Rectangle();
		System.out.println("3rd object parameter is "+rec2.parameter());
		System.out.println("3rd object area is "+rec2.area());
		rec2.setWidth(9);
		System.out.println("3rd object parameter is "+rec2.parameter());
		System.out.println("3rd object area is "+rec2.area());
		System.out.println("Enter any integer value");
		Scanner input=new Scanner(System.in);
		Rectangle rec3=new Rectangle(input.nextInt());
		rec3.setWidth(5);
		System.out.println("Last object parameter is "+rec3.parameter());
		System.out.println("Last object area is "+rec3.area());
		
		

	}
}
