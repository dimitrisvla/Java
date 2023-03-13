import java.util.Scanner;

public class LinearEquation1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a, b;
		
		System.out.println("Please give a and b \n");
		a = reader.nextInt();
		b = reader.nextInt();

		double x = -b/(double)a;
		System.out.println("The solution to the equation " + a + "x+" + b + "=0 is " + x);
	}

}
