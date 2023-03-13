
public class TwoPersons {

	public static void main(String[] args) {
		Person alice = new Person("Alice");
		Person bob = new Person("Bob");
		
		if(!alice.equals(bob)) {
			System.out.println("There are 2 different persons: " + alice + " and " + bob);
		}
	}

}
