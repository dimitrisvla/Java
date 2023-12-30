import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		int length = 5;
		int[] intArray = getIntegers(length);
		intArray = getSortedArray(intArray, length);
		System.out.println("Sorted array: " + Arrays.toString(intArray));
		
	}
	
	public static int[] getIntegers(int len) {
		Scanner input = new Scanner(System.in);
		
		int[] newIntArray = new int[len];
		for(int i=0; i<len; i++) {
			System.out.println("Please give an integer: ");
			newIntArray[i]  = input.nextInt();
		}
		return newIntArray;
	}
	
	public static int[] getSortedArray(int[] intArray, int arrayLength) {
		 System.out.println(Arrays.toString(intArray));
	     int[] sortedArray = Arrays.copyOf(intArray, arrayLength);
	     boolean flag = true;
	     int temp;
	     while (flag) {
	    	 flag = false;
	         for (int i = 0; i < sortedArray.length - 1; i++) {
	        	 if (sortedArray[i] < sortedArray[i + 1]) {
	        		 temp = sortedArray[i];
	        		 sortedArray[i] = sortedArray[i + 1];
	        		 sortedArray[i + 1] = temp;
	        		 flag = true;
	              }
	         }
	         System.out.println("sorting ==>" + Arrays.toString(sortedArray));
	     }
	     return sortedArray;
	}
}
