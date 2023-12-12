
public class CarWithPassengers {
	private int CAR_SIZE = 4;
	private int position = 0;
	private Person[] passengers = new Person[CAR_SIZE];
	private int numOfPassengers = 0;
	
	public void addPassenger(Person passenger) {
		if(numOfPassengers < CAR_SIZE) {
			passengers[numOfPassengers] = passenger;
			numOfPassengers++;
		}
	}
	
	public String toString() {
		String retValue = "Car at " + position + "with passengers: ";
		for(int i=0; i<numOfPassengers; i++) {
			retValue += passengers[i] + " ";
		}
		return retValue;
	}
	

	public static void main(String[] args) {
		CarWithPassengers myCar = new CarWithPassengers();
		
		Person alice = new Person("Alice");
		myCar.addPassenger(alice);
		Person bob = new Person("Bob");
		myCar.addPassenger(bob);
		Person jim = new Person("Jim");
		myCar.addPassenger(jim);
		Person olga = new Person("Olga");
		myCar.addPassenger(olga);
		
		System.out.println(myCar);
	}

}
