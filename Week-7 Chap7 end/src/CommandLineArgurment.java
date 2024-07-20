
public class CommandLineArgurment {

	public static void print(double ... gpa) {
		double sum,avg;
		sum=0;
		for(double g:gpa) {
			sum+=g;
		}
		avg=sum/gpa.length;
		
		System.out.println("Average GPA is "+avg);
		
	}
	public static void main(String arg[]) {
		double d1,d2,d3,d4;
		d1=Double.parseDouble(arg[0]);
		d2=Double.parseDouble(arg[1]);
		d3=Double.parseDouble(arg[2]);
		d4=Double.parseDouble(arg[3]);
		System.out.print(d1+"  "+d2+ "  "+d3+"  "+d4+"\n");
		print(d1,d2,d3,d4);
		
	}
}
