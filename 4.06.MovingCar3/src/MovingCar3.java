import java.util.Scanner;

public class MovingCar3 {

	public static void main(String[] args) {
		
		System.out.println("How many steps do you want the car to move ?");
		Scanner input = new Scanner(System.in);
		Car myCar = new Car();
		
		int steps = input.nextInt();
		boolean carMoved = myCar.moveManySteps(steps);
		
		if(carMoved) {
			myCar.printPosition();
		}else {
			System.out.println("Car could not move");
		}
	}

}
