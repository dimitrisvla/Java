import java.util.Scanner;

class LinearEquation3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to solve a linear equation?");
		String answer = input.next();

		while (!answer.equals("no"))
		{
			System.out.println("Give alpha and beta:");
			int alpha = input.nextInt();
			int beta = input.nextInt();
			if (alpha != 0){
				double solution = -beta/(double)alpha;
				System.out.println("The solution to the equation "+alpha+"x"+ "+"+beta+" = 0 is x="+solution);
			}else if (beta == 0){
				System.out.println("Infinite Solutions");
			}else{
				System.out.println("No solution");
			}

			System.out.println("Do you want to solve a linear equation?");
			answer = input.next();
		}
	}
}	
