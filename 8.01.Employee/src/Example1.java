
public class Example1 {

	public static void main(String[] args) {
		
		HourlyEmployee alice = new HourlyEmployee("Alice", 100, 50.5, 40);
		SalariedEmployee bob = new SalariedEmployee("Bob", 200, 100000);
		
		System.out.println("Alice: " + alice.getName() + " " + alice.getAFM() + " " + alice.getPay());
		System.out.println("Bob: " + bob.getName() + " " + bob.getAFM() + " " + bob.getPay());
	}

}
