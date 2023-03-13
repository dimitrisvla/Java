import java.util.Scanner;

public class ArrayInitialization {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Give the size of the array: ");
		int n = input.nextInt();
		
		int[] array1d = new int[n];
		
		System.out.println("print content of array: ");
		for(int i=0; i<n; i++) {
			array1d[i] = i + i*2;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(array1d[i] + " ");
		}
		System.out.println();
	}

}
