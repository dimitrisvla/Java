
public class TestArrays2 {

	public static void main(String[] args) {
		int[][] arr3 = {{1, 2, 3}, {3, 4, 5}};
		int[][] arr4 = new int [10][10];
		
		arr4 = arr3;
		
		System.out.println(arr4.length + " " + arr4[0].length); // diastash
		
		int arr5[][] = new int[2][];
		arr5[0] = new int [3];
		arr5[1] = new int [5];
		System.out.println(arr5.length + " " + arr5[0].length +  //15 3 5
							" " + arr5[1].length);
	}

}
