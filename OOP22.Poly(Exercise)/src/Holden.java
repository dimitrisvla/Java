
public class Holden extends Car {

	public Holden(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "For our Holden:" + super.startEngine();
	}

	@Override
	public String accelerate() {
		return "For our Holden:" + super.accelerate();
	}

	@Override
	public String brake() {
		return "For our Holden:" + super.brake();
	}

	
}
