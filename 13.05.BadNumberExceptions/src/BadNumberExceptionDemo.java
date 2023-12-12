import java.util.Scanner;

public class BadNumberExceptionDemo {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter year of birth:");
			int inputNumber = input.nextInt();
			
			if(inputNumber >2018) {
				throw new BadNumberException(inputNumber);
			}
			System.out.println("Thank you for entering number " + inputNumber);
		}catch (BadNumberException e) {
			System.out.println(e.getBadNumber() + " is not valid.");  
		}

		System.out.println("End of program...");
	}

}
