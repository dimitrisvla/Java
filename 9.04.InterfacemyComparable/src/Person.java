import java.util.Scanner;

 public class Person implements myComparable{
	
	private String name;
	private int number;
	
	public Person() {
		System.out.println("Please enter a name and a number");
		Scanner input = new Scanner(System.in);
		name = input.next();
		number = input.nextInt();

	}

	public String toString() {
		return "Person: [name=" + name + ", number=" + number + "]";
	}
	

	public int compareTo(myComparable other) {
		Person otherPerson = (Person) other;
		if(number < otherPerson.number) {
			return -1;
		}else if(number == otherPerson.number) {
			return 0;
		}else {
			return 1;
		}
	}

}
