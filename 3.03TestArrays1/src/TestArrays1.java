
public class TestArrays1 {

	public static void main(String[] args) {
		int[] arr0;  // int arr0[];
		
		int[] arr1 = {1, 2, 3, 4};

		System.out.println("print content of array1: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		int arr2[] = new int [10];
		
		arr0 = arr1;

		System.out.println("print content of array2: ");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = i+1;
			System.out.println(arr2[i]);
		}

		System.out.println("print content of array0: ");
		for(int x:arr0) {
			System.out.println(x);
		}
	}

}
