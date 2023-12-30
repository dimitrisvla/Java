
public class Car {
	private String descrption;

	public Car(String descrption) {
		this.descrption = descrption;
	}

	public void startEngine() {
		System.out.println("Car engine started...");
	}
	
	public void drive() {
		runEngine();
		System.out.println("Driving the car, type " + getClass().getSimpleName());
	}
	
	protected void runEngine() {
		System.out.println("Car engine running...");
	}
}
