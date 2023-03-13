
public class TrafficSimulation {

	public static void main(String[] args) {
		TrafficLight light = new TrafficLight();
		Car myCar = new Car();
		
		for(int i=0; i<10; i++) {
			light.printStatus();
			myCar.printPosition();
			myCar.move(light);
			light.change();
		}
	}

}
