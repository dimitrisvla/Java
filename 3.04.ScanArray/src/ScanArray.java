
public class ScanArray {

	public static void main(String[] args) {
		double [] array = {5.3, 3.4, 2.3, 1.2, 0.1};
		
		// Print all elements
		for(double element: array) {
			System.out.println(element);
		}
		System.out.println();
		
		// Print all pairs of elements
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				System.out.println(array[i] + " " + array[j]);
			}
		}

	}

}
