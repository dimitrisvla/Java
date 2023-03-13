
public class Car {

	private int position = 0;
	
	public Car() {	}
	
	public void move (int delta) {
		position += delta;
	}
	
	public void catchUp(Car other) {
		if(this.position > other.position) {
			this.position = other.position;
		}else {
			other.position = this.position;
		}
	}
	
	public void printPosition() {
		System.out.println("Car is at position " + position);
	}
}
