import java.util.Scanner;

public class ArrayException {

	public static void main(String arg[]) {
		int[] array=new int[5];
		int i;
		for(i=0;i<5;i++)
			array[i]=i;
		for(i=0;i<5;i++)
		System.out.println(array[i]);
		int value;
		Scanner inp=new Scanner(System.in);
		System.out.println("enter location value you want to divide by");
		value=inp.nextInt();
		try {
			int val=100/array[value];
			System.out.println("100/"+array[value]+" is "+val);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caution, Array Limit "+array.length+" Reached");
		}
		
		catch(ArithmeticException ar) {
			System.out.println("Divide by zero exception occured");
		}
}}
