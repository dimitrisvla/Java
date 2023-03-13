
public class ComparableExample {

	public static void main(String[] args) {
		
		Person[] array = new Person[5];
		for(int i=0; i<array.length; i++) {
			array[i] = new Person();
		}
		
		sort(array);
		System.out.println();
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

	private static void sort(myComparable[] array) {
		for(int i=0; i<array.length; i++) {
			myComparable minElement = array[i];
			for(int j=i+1; j<array.length; j++) {
				if(minElement.compareTo(array[j])>0) {
					minElement = array[j];
					array[j] = array[i];
					array[i] = minElement;
				}
			}
		}
		
	}

}
