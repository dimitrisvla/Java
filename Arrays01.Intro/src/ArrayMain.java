import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		
		int[] myIntArray = new int[10];
		myIntArray[0] = 45;
		myIntArray[1] = 1;
		myIntArray[3] = 333;
		
		double[] myDoubleArray = new double[5];
		myDoubleArray[4] = 0.444;
		System.out.println(myDoubleArray[4]);
		
		int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("first = " + firstTen[0]);
		int firstTenLength = firstTen.length;
		System.out.println("Length of the array = " + firstTenLength);
		System.out.println("Last element if array = " + firstTen[firstTenLength-1]);
	
		int newArray[] = new int[5]; // initialized to zeros
		for(int i=0; i<newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		for(int i=0; i<newArray.length; i++) {
			newArray[i] = newArray.length - i;
		}
		System.out.println();
		for(int element: newArray) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(newArray));
		Object objectVar = newArray;
		if(objectVar instanceof int[]) {
			System.out.println("objectVar is an int array");
		}
		
		Object[] objectArray = new Object[3];
		objectArray[0] = "Hello";
		objectArray[1] = "world!";
		objectArray[1] = newArray;
	}

}
