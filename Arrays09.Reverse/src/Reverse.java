import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int numOfElements = readInteger();
		
		int array[] = readElements(numOfElements);
		System.out.println(Arrays.toString(array));
		
		//reverse(array); //WRONG
		
		reverse2(array);
	}

	
	private static int readInteger() {;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please give an integer(num of array's element): ");
		int numOfElements = input.nextInt();
		return numOfElements; 
	}

	private static int[] readElements(int numOfElements) {
		int[] array = new int [numOfElements];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Please give an integer(element): ");
			array[i] = input.nextInt();
		}
		return array;
	}

	private static void reverse(int array[]) {
		int n = array.length;
		int i,j,temp;
		for(i=0,j=n-1; i<n; i++,j--) {	
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				System.out.println("==> " + Arrays.toString(array));
		}
	}
	
	  private static void reverse2(int[] array) {

	        int maxIndex = array.length - 1;
	        int halfLength = array.length / 2;

	        for (int i = 0; i < halfLength; i++) {
	            int temp = array[i];
	            array[i] = array[maxIndex - i];
	            array[maxIndex - i] = temp;
	            System.out.println("==> " + Arrays.toString(array));
	        }
	  }

}
