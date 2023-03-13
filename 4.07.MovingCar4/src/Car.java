
public class Car {
	
	private int position = 0;
	
	public void moveManySteps(int steps) {
		int delta = 1;
		
		if(steps < 0) {
			steps = -steps;
			delta = -1;
		}
		
		for(int i=0; i<steps; i++) {
			position += delta;
			//System.out.println("Car at position: " + position);
			printPosition();
		}
	}
	
	public void printPosition() {
		System.out.println("Car at position: " + position);
	}
}
