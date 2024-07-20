
public class ArrayBasics {

	public static void square(int [] recvArray) {
		for(int i=0;i<recvArray.length;i++)
			recvArray[i]*=recvArray[i];
			//recvArray[i]=recvArray[i]*recvArray[i];
	}
	public static void square(int a) {
		a=a*a;
		System.out.println("Modified "+a);
	}
	public static void printArray(int [] recvArray) {
		System.out.println("Printing Array");
		for(int i=0;i<recvArray.length;i++)
			System.out.println(recvArray[i]);
	}
	public static void modifyElement(int element) {
		
	}
	
	public static void modifyArray(int[] arrayM) {
		
		for(int i=0;i<arrayM.length;i++) {
			arrayM[i]+=10;
		}
	}
	
	public static void main(String arg[]) {
		
		int[] myArray= {10,20,5};
		printArray(myArray);
		square(myArray);
		printArray(myArray);
		for(int i=0;i<myArray.length;i++)
			square(myArray[i]);
		
		printArray(myArray);
		/*
		int[] array= {1,2,3,4};
		int i;
		for(i=0;i<array.length;i++) {
			System.out.printf("%d%5d",i,array[i]);
			System.out.println();
			
		}
		System.out.println("After Modification");
		modifyArray(array);
		for(i=0;i<array.length;i++) {
			System.out.printf("%d%5d",i,array[i]);
			System.out.println();
		}
		*/
	}
	
}
