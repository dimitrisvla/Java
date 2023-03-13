
public class Car {

	private int position = 0;
	private Person driver;
	
	public Car(int position, String name) {
		this.position = position;
		this.driver = new Person(name);
	}
	
	public String toString() {
		return driver.getName() + " "  + position;
	}
	
}
