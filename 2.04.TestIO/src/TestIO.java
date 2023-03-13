import java.util.Scanner;

public class TestIO {

	public static void main(String[] args) {
		System.out.println("Say something: ");
		
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		System.out.println(line);

	}

}
