
public class StackTest {

	public static void main(String[] args) {
		
		Stack<Person> personStack = new Stack<Person>();
		
		personStack.push(new Person("Alice", 1));
		personStack.push(new Person("Jim", 999));	
		System.out.println(personStack.pop());
		System.out.println(personStack.pop());
		
		System.out.println(); // new line
		
		Stack<Integer> intStack = new Stack<Integer>();
		intStack.push(new Integer(24));
		intStack.push(new Integer(67));
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		
		System.out.println(); // new line
		
		Stack<String> stringStack = new Stack<String>();
		stringStack.push("Today is a good day indeed!");
		stringStack.push("Good day!");
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
	}

}
