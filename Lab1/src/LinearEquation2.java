import java.util.Scanner;

public class LinearEquation2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b;
		
		System.out.println("Please give a and b \n");
		a = reader.nextInt();
		b = reader.nextInt();

		if (a==0 && b==0) {
			System.out.println("Infinite Solutions");
			System.exit(0);
		}
		if(a==0 && b !=0) {
			System.out.println("No Solution");
			System.exit(0);
		}
		double x = -b/(double)a;
		System.out.println("The solution to the equation " + a + "x+" + b + "=0 is " + x);
	}

}
