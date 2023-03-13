
public class Example {

	public static void main(String[] args) {

		Vehicle[] v = new Vehicle[2];
		v[0] = new Car(0, 100);
		v[1] = new Bike();
		
		v[0].move(); v[0].print();
		v[1].move(); v[1].print();
		
		int gas = ((Car)v[0]).getGas();
		System.out.println("Gas in our car: " + gas);
	}

}
