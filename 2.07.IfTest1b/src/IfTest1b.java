import java.util.Scanner;

public class IfTest1b {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int inputInt = reader.nextInt();
		
		boolean inputIsPositive = (inputInt > 0);
		
		if(inputIsPositive == true) { // <===>	if(inputIsPositive)
			System.out.println(inputInt + " is positive");
		}
	}

}
