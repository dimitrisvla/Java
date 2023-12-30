import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] array = readIntegerValues();
		int minElement = findMin(array);
        System.out.println("min = " + minElement);
	}
	
	private static int[] readIntegerValues() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a list of integers, seperated by commas:");
		String element = input.nextLine();
		
		String[] splittedElements = element.split(",");
		System.out.println("Sorted array: " + Arrays.toString(splittedElements));
		int[] values = new int[splittedElements.length];
		
		for(int i=0; i<splittedElements.length; i++) {
			values[i] = Integer.parseInt(splittedElements.toString());
		}
		
		return values;
	}
	
	
	private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }
}
