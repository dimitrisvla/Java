
public class Car {

	private int position;
	
	public Car() {
		this.position = 0;
	}
	
	public Car(int position) {
		this.position = position;
	}
	
	public void move() {
		position++;
	}
	
	public void move(int delta) {
		position += delta;
	}
	
	public void printPosition() {
		System.out.println("position: " + position);
	}
}
