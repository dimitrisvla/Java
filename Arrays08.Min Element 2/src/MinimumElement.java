import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

	public static void main(String[] args) {
		int numOfElements = readInteger();
		int array[] = readElements(numOfElements);
		int minElement = findMin(array);
		System.out.println(Arrays.toString(array));
		System.out.println("The min element of the above array is: " + minElement);
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
	
	private static int findMin(int array[]) {
		int minElement = array[0];
		
		for(int i=1; i< array.length; i++) {
			if(array[i]<minElement) {
				minElement = array[i];
			}	
		}
		return minElement;
	}



}
