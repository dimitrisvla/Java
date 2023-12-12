import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> mySet = new HashSet<String>(); // HashSet variable of Strings
		Scanner input = new Scanner(System.in);

		System.out.println("Start adding Strings...");
		while(input.hasNextLine()) { // while another token exists (until EOL)
			String name = input.next();
			if(!mySet.contains(name)) { // SOS: Every String is unique
				mySet.add(name);
				System.out.println("String " + name + " added");
			}
		}
		System.out.println("We are done adding Strings...");
		
		for(String name: mySet) {
			System.out.println(name);
		}
		
		Object []array = mySet.toArray();
		for(int i = 0; i< array.length; i++) {
			String name = (String)array[i];
			System.out.println(name);
		}
	}

}
