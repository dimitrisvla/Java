import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] stringArray = {"Jim", "Eleni", "Maria", "Kostas","Gianna"}; 
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString(stringArray));
		
		if(Arrays.binarySearch(stringArray, "Gianna") >= 0) {
			System.out.println("Name Gianna found.");
		}else {
			System.out.println("Name not found.");
		}
		//----------------------------------------------------------------------//
		int string1[] = {1,2,3,4,5,6};
		int string2[] = {1,2,3,4,5,6};
		int string3[] = {1,2,3,4,5,9};
		
		if (Arrays.equals(string1, string3)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
	}

}
