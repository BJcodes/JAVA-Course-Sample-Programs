import javax.swing.*;

public class Hello {

	public static void main(String arg[]) {
			System.out.println("Welcome to OOP-II");
			int a,b;
			int sum;
			
			a=10;
			b=20;
			sum=a+b;
			//System.out.println("Sum of "+a+" and "+b+"  is  "+sum);
			System.out.println("a is "+a);
			System.out.println(" a is "+(double)a);
			double d=100.56;
			System.out.println("d int is "+(int)d);
			
			double d1=10.2;
			double d2=20.4;
			int summ;
			summ= (int)d1+ (int)d2;
			
			int n=10;
			for(int i=1;i<16;i++) {
				
				System.out.println(" "+i+" x "+n+" =  "+i*n);
			}
	}
}
