
public class Car {

	private int position = 0;
	
	public boolean moveManySteps(int steps) {
		if((position + steps < -10) || (position + steps > 10)) {
			return false;
		}else {
			position += steps;
			return true;
		}
	}
	
	public void printPosition() {
		System.out.println("Car at position: " + position);
	}
	
}
