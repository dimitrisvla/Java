import java.util.Random;

public class RandomBooleanVector {
	
	private int size;
	private boolean[]array;
	Random rand = new Random();
	
	public RandomBooleanVector(int size) {
		this.size = size;
		array = new boolean[size];
		for(int i=0; i<array.length; i++) {
			array[i] = rand.nextBoolean();  // initialize array
		}
	}
	public String toString() {
		String stringFromBool = "";
		for(int i=0; i<array.length-1; i++) {
			if(array[i] == true) {
				stringFromBool += "true, ";
			}else {
				stringFromBool += "false, ";
			}
		}
		if(array[size-1] == true) {  // last index
			stringFromBool += "true";
		}else {
			stringFromBool += "false";
		}
		return stringFromBool;
	}
	
	public boolean equals(RandomBooleanVector other) {
		int i = 0;
		if(this.size == other.size) {
			while(this.array[i] == other.array[i]) {
				i++;
			}
			if(i == size-1) {
				return true;
			}
		}	
		return false;
	}
	
	public static void main(String[] args) {
		RandomBooleanVector vector1 = new RandomBooleanVector(3); 
		RandomBooleanVector vector2 = new RandomBooleanVector(3);
		System.out.println(vector1.toString());
		System.out.println(vector2.toString());
		
		if(vector1.equals(vector2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
	}

}
