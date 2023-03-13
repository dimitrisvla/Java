
public class MovingCar {

	public static void main(String[] args) {
		Car myCar = new Car(1);
		myCar.move(-10);
		myCar.printPosition();
		
		Car myCar2 = new Car();
		myCar2.move();
		myCar2.printPosition();
	}

}
