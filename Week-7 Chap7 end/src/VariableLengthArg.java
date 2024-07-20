
public class VariableLengthArg {

	
	public static void print(double ... values) {
		int i=-1;
		double sum=0;
		int tValues=0;
		for(double val:values)
		{	tValues++;
			sum=sum+val;
			System.out.println("value at location "+(++i)+ " is "+val);
		}
		
		double avg;
		avg=sum/values.length;
		
		System.out.println("Total Values "+values.length+" Sum is "+sum);
		System.out.println("average "+avg);
		
	}
	public static void main(String arg[]) {
		
		double a,b,c;
		a=10.1;
		b=13.3;
		c=45.5;
		print(c,b,a);
		double d=9.0;
		print(c,b,a,d);
	/*	
		int [] array= {10,20,30,40,50};
		int var;
		int i;
		for(i=0;i<array.length;i++)
			{	var=array[i];
				System.out.println(var);
			}
		System.out.println("Printing through a special loop");
		for(int someValue:array) {
				System.out.println(someValue);
		}

*/
	}
}