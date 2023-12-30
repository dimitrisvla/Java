import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) {
		int length = 5;
		int[] intArray = getRandomArray(length);
		intArray = getSortedArray(intArray, length);
		System.out.println(Arrays.toString(intArray));
	}
	
	public static int[] getSortedArray(int[] intArray, int arrayLength) {
		int temp ;
		for(int i=0; i<arrayLength-1; i++ ) {
			if(intArray[i] < intArray[i+1]) {
				temp = intArray[i];
				intArray[i] = intArray[i+1];
				intArray[i+1] = temp;
			}
		}
		
		return intArray;
		
	}

	private static int[] getRandomArray(int len) {
		Random rand = new Random();
		
		int[] newIntArray = new int[len];
		for(int i=0; i<len; i++) {
			newIntArray[i]  = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(newIntArray));
		return newIntArray;
	}
}
