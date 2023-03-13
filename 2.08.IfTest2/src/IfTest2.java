import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int inputInt = reader.nextInt();
		
		if(inputInt > 0) {
			System.out.println(inputInt + " is positive");
		}else {
			System.out.println(inputInt + " is not positive");
		}
	}

}
