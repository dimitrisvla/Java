import java.util.Objects;

public class Person {

	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Person: [firstName= " + firstName + ", lastName= " + lastName + "]\n";
	}


	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}


	public boolean equals(Person other) {
		
		return(this.firstName.equals(other.firstName) &&
				this.lastName.equals(other.lastName));	
	}
	
	
	
}
