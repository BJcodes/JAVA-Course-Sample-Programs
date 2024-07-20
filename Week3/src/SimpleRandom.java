import java.util.Random;

public class SimpleRandom {

	public static void main(String arg[]) {
		
		Random aValue = new Random();
		int a;
		int one,two,three,four,five;
		one=two=three=four=five=0;
			for(int i=0;i<15;i++) {
			a=1+aValue.nextInt(5);
			System.out.println(a);
			switch(a) {
			case 1: one++;
					break;
			case 2: two++;
					break;
			case 3: three++;
					break;
			case 4: four++;
					break;
			case 5: five++;
					break;
			}
			
			}
			System.out.println("1 = "+one+"times");
			System.out.println("2 = "+two+"times");
			System.out.println("3 = "+three+"times");
			System.out.println("4 = "+four+"times");
			System.out.println("5 = "+five+"times");
	}
}
