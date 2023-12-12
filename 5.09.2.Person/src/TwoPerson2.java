
public class TwoPerson2 {

	public static void main(String[] args) {
		Person alice = new Person("Alice", "Wonderland");
		Person bob = new Person("Bob", "Sfougkarakis");
		if(!alice.equals(bob)) {
			System.out.println("There are 2 different persons:\n" + alice + "and " + bob);
		}
	}

}
