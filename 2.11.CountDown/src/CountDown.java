import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int inputInt = reader.nextInt();
		
		while(inputInt != 0) {
			if (inputInt < 0) {
				for(int i = inputInt; i<0; i++) {
					System.out.println("Counter = " + i);
				}
			}else if (inputInt > 0) {
				for(int i=inputInt; i>0; i--) {
					System.out.println("Counter = " + i);
				}
			}
			inputInt = reader.nextInt();
		}

	}

}
