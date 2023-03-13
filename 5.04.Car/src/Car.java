
public class Car {

	private int position = 0;
	
	public Car(int position) {
		this.position = position;
	}
	
	public int distance(Car other) {
		return this.position - other.position;
	}
	
	
}
