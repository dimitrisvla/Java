
public class Person {

	private String name;
	private int number;
	
	public Person(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public String toString() {
		return name+ ":" +number;
	}
}
