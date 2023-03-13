
public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Person other) {
		return this.name.equals(other.name);
	}
}
