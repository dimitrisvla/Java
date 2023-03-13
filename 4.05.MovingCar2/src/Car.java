
public class Car {

	private int position = 0;
	
	public void moveManySteps(int steps) {
		position += steps;
		System.out.println(" steps: " + position);
	}
}
