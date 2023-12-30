import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] myIntArray = new int[5];
		int[] intArray2 = myIntArray;
		
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("intArray2 = " + Arrays.toString(intArray2));
		
		intArray2[0] = 8;
		intArray2[4] = 3;
		//intArray2[5] = 3; ==> Index 5 out of bounds 
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("intArray2 = " + Arrays.toString(intArray2));
		
		modifyArray(myIntArray);
		System.out.println("myIntArray = " + Arrays.toString(myIntArray));
		System.out.println("intArray2 = " + Arrays.toString(intArray2));
	}
	
	private static void modifyArray(int[] myIntArray) {
		myIntArray[1] = 1;
		myIntArray[2] = 22;
		myIntArray[3] = -81;
		
	}



}
