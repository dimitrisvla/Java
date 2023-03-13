import java.util.Random;

public class Car {
	private int MAX_VALUE = 3;
	private int position = 0;
	private Random randomGenerator = new Random();
	
	private int computeRandomSteps() {
		int randomSteps = randomGenerator.nextInt(2*MAX_VALUE + 1) - MAX_VALUE;
		return randomSteps;
	}
	
	public void move() {
		int steps = computeRandomSteps();
		moveManySteps(steps);
	}
	
	public void moveManySteps(int steps) {
		int delta = 1;
		
		if(steps < 0) {
			steps = -steps;
			delta = -1;
		}
		
		for(int i=0; i<steps; i++) {
			position += delta;
			printPosition();
		}
	}
	
	public void printPosition() {
		System.out.println("Car at position " + position);
	}
	
}
