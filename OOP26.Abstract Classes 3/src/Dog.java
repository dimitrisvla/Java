
public class Dog extends Mammal{

	public Dog(String type, String size, double weight) {
		super(type, size, weight);
	}

	@Override
	public void shedHair() {
		
		System.out.println(getExplicitType() + " shed hair all the time");	
	}

	@Override
	public void makeNoise() {
		
		if (type == "Wolf") {
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }
	}
}
