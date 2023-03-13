
public class Person {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void speak(String s) {
		System.out.println(name + ": " + s);
	}
}
