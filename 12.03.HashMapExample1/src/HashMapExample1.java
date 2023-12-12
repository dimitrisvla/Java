import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<String,Integer> myMap = new HashMap<String,Integer>();
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		while(input.hasNext() && counter<5) {
			String name = input.next();
			if(!myMap.containsKey(name)) {
				myMap.put(name, counter);
				counter++;
			}
		}
		
		for(String name: myMap.keySet()) { // in alphabetic order
			System.out.println(name + ":" + myMap.get(name));
		}

	}

}
