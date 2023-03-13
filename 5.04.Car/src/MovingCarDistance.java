
public class MovingCarDistance {


	public static void main(String[] args) {
		Car myCar1 = new Car(1);
		Car myCar2 = new Car(0);
			
		System.out.println("Distance of car 1 from car 2: " + myCar1.distance(myCar2));
		System.out.println("Distance of car 2 from car 1: " + myCar2.distance(myCar1));
			
	}

}
