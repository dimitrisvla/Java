
public class Car {

	private int position = 0;
	
	public void move() {
		position += 1;
	}
	
	public void printPosition() {
		System.out.println("Car at position " + position);
	}
}
