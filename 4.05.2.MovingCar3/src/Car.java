
public class Car {
	private int position = 0;
	
	public void moveManySteps(int steps, String direction) {
		if(direction.equals("right")) {
			position += steps;
		}
		if(direction.equals("left")) {
			position -= steps;
		}	
	}
	
	public void printPosition() {
		System.out.println("Car's position: " + position);
	}
}
