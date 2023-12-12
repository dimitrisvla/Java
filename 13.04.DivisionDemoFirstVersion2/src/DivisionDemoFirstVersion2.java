import java.util.Scanner;

public class DivisionDemoFirstVersion2 {
	
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter numerator: ");
			int numerator = input.nextInt();
			
			System.out.println("Enter denominator: ");
			int denominator = input.nextInt();
			
			if(denominator == 0) {
				throw new DivisionByZeroException();
			}
			
			double quotient = numerator/(double)denominator;
			System.out.println(numerator + "/" + denominator + " = " + quotient);
		}catch (DivisionByZeroException e) {
			System.out.println(e.getMessage());
			secondChance();
		}
		
		System.out.println("End of program");
	}

	private static void secondChance() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numerator: ");
		int numerator = input.nextInt();
		
		System.out.println("Enter denominator: ");
		System.out.println("Please be sure the demonitor is not zero! ");
		int denominator = input.nextInt();
		
		if(denominator == 0) {
			System.out.println("I cannot do division by zero");
			System.out.println("Abortion program");
			System.exit(0);
		}
		
		double quotient = numerator/(double)denominator;
		System.out.println(numerator + "/" + denominator + " = " + quotient);
	}
}
