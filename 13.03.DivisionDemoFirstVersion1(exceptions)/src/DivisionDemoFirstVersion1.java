import java.util.Scanner;

public class DivisionDemoFirstVersion1 {

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
			System.exit(0);
		}
		
		System.out.println("End of program");
	}

}
