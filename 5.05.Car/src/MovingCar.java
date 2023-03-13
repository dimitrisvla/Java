
public class MovingCar {

	public static void main(String[] args) {
		Car myCar1 = new Car(); myCar1.move(10);
		Car myCar2 = new Car(); myCar2.move(20);
		myCar1.printPosition(); myCar2.printPosition();
		myCar1.catchUp(myCar2);
		System.out.println("After catching up...");
		myCar1.printPosition(); myCar2.printPosition();
	}

}
