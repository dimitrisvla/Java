import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Please give an int number: ");
		int inputInt = reader.nextInt();
		
		if(inputInt > 0) {
			System.out.println(inputInt + " is positive");
		}

	}

}
