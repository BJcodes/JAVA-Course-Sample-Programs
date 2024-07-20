package Grade;

import java.util.Scanner;

import javax.swing.JOptionPane;

//import java.util.Scanner;
public class GradeSimple {
	public static void main(String v[]) {
		
		/*
		String courseName;
		int marks;
		String grade;
	//	Scanner input=new Scanner(System.in);
		System.out.println("Enter value for marks");
		//marks=input.nextInt();
		//System.out.println(marks);
		String str=JOptionPane.showInputDialog("Enter any value");
		marks=Integer.parseInt(str);
		
		
		grade=null;
		courseName="OOP-II";
	
		if(0<=marks && marks<=49)
			grade="F";
		else if(50<=marks && marks<=59)
			grade="D";
		else if(60<=marks && marks<=69)
			grade="C";
		else if(70<=marks && marks<=79)
			grade="B";
		else if(80<=marks && marks<=84)
			grade="B+";
		else if(85<=marks && marks<=100)
			grade="A";
		else
			grade="x";
		
		if (grade.equals("x"))
			System.out.println("Wrong Value for Marks");
		else
			System.out.println("Course Name: "+courseName+"\nMarks: "+marks+"\nGrade: "+grade);
	*/
		System.out.println("Simple console input");
		Scanner obj=new Scanner(System.in);
		int abc;
		abc=obj.nextInt();
	
		System.out.println("your input is "+obj.nextInt());
	}
	
	

}
