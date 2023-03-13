
public class Car {
	
	private Integer position = 0;
	
	public Car(int position) {
		this.position = position;
	}
	
	public void move(int delta) {
		position += delta;
	}
	
	public String toString() {
		return position.toString();
	}
	
}
