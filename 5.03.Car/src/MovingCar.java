
public class MovingCar {

	public static void main(String[] args) {
		Car myCar1 = new Car(1);
		Car myCar2 = new Car(0);
		
		myCar2.move(2);
		System.out.println("Distance of car 1 from car 2: " + computeDistance(myCar1,myCar2));
		System.out.println("Distance of car 2 from car 2: " + computeDistance(myCar2,myCar1));
		
	}

	private static int computeDistance(Car myCar1, Car myCar2) {
		return myCar1.getPosition() - myCar2.getPosition();
	}

}
