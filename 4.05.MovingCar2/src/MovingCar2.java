
public class MovingCar2 {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		int x = 10;
		myCar.moveManySteps(x);
		myCar.moveManySteps(10);
		myCar.moveManySteps(2*x + 10);
	}

}
