
public class Car {

	private int position = 0;
	
	public int printPosition() {
		System.out.println("Car at " + position);
		return 1;
	}
	
	public void move(TrafficLight light) {
		if(!light.isRed()) {
			position++;
		}
	}
}
