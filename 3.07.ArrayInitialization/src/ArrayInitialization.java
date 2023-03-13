import java.util.Scanner;

public class ArrayInitialization {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give the size of the 2d array:");
		int n = input.nextInt();
		
		int[][] array2d = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				array2d[i][j] = i*n + j;
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println(array2d[i][j] + " ");
			}
			System.out.println();
		}
	}

}
