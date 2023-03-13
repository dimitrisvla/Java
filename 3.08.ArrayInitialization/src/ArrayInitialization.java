import java.util.Scanner;

public class ArrayInitialization {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int [][] lowerDiagonal = new int[n][];
		
		for(int i=0; i<n; i++) {
			lowerDiagonal[i] = new int[i+1];
			for(int j=0; j<i+1; j++) {
				lowerDiagonal[i][j] = i*(i+1)/2 + j;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.println(lowerDiagonal[i][j] + " ");
			}
			System.out.println();
		}

	}

}
