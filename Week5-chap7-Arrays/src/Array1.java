import java.util.Scanner;

public class Array1 {

	public static void main(String areg[]) {
		/*
		int[] marks=new int[6];
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter Marks "+i);
			marks[i]=input.nextInt();
		}
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		int min,max;
		min=max=marks[0];
		for(int i=0;i<marks.length;i++) {
			if(0<=marks[i]&& marks[i]<50)
				System.out.println(marks[i]+"-FAIL");
			else if(50<=marks[i]&& marks[i]<=100)
				System.out.println(marks[i]+"-PASS");
			else
				System.out.println(marks[i]+"-Wrong Value");
		}
		for(int i=1;i<marks.length;i++) {
		
			if(marks[i]>=0 && marks[i]<=100) {
				if(min>marks[i])
					min=marks[i];
				if(max<marks[i])
					max=marks[i];
			}
			
		}
		
		System.out.println("Topper is "+max);
		System.out.println("Stopper is "+min);
	
*/
	
	
		int[] marks= {10,11,15,17,20,34};
		int [] even=new int[marks.length];
		int [] odd=new int[marks.length];
		
		int i,e,o;
		e=o=-1;
		for(i=0;i<marks.length;i++) {
			if(marks[i]%2 == 0) {
				even[++e]=marks[i];
				//e++;
			}
			else
			{
				odd[++o]=marks[i];
				//o++;
			}
			
		}
		System.out.println("Complete Array");
		for(i=0;i<marks.length;i++)
		System.out.println(marks[i]);
		System.out.println("Even Array");
		for(i=0;i<=e;i++)
			System.out.println(even[i]);
		System.out.println("Odd Array");
		for(i=0;i<=o;i++)
			System.out.println(odd[i]);
	}
}
