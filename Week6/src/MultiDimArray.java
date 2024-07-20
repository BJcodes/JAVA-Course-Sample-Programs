import java.util.Scanner;

public class MultiDimArray {

	public static void main(String arg[]) {
		Scanner input=new Scanner (System.in);
		int r,c;
		int A[][]=new int[2][3];
		for(r=0;r<2;r++)
			for(c=0;c<3;c++) {
				System.out.println("value at "+r+":"+c);
				A[r][c]=input.nextInt();
		}
		int b[][]= {{1,2,3},{4,5,6}};
		
		for(r=0;r<2;r++) {
			
			for(c=0;c<3;c++) {
				System.out.print(A[r][c]+"  ");
			}
			System.out.println();
		}
		
	}
}
