import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		System.out.println("Please give an int number: ");
		String input = inputReader.next();
		
		do{
			System.out.println("Do you want to continue? (yes/no)");
			input = inputReader.next();
			if(input.equals("no")) {break;}
			System.out.println("Please give another int number: ");
			input = inputReader.next();
		}while(input.equals("no"));
		System.out.println("Stopped reading numbers....");
	}
}
