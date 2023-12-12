import java.util.Scanner;

public class CountDown_do_while {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please give a number: ");
		int inputInt = reader.nextInt();
		System.out.println("The number you gave is: " + inputInt);
		 do
		 {
			if (inputInt < 0) {  // if negative
				for(int i = inputInt; i<0; i++) {
					System.out.println("Counter = " + i);
				}
				//break;
			}else if (inputInt > 0) {  // if positive
				for(int i=inputInt; i>0; i--) {
					System.out.println("Counter = " + i);
				}
				//break;
			}
			System.out.println("Please give another number: ");
			inputInt = reader.nextInt();
			System.out.println("The number you gave is: " + inputInt);
		}while(inputInt != 0);
		
		System.out.println("We are finished reading...");
	}
}
