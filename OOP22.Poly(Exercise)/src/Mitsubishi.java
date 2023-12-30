
public class Mitsubishi extends Car {

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "For our Mitsubishi:" + super.startEngine();
	}

	@Override
	public String accelerate() {
		return "For our Mitsubishi:" + super.accelerate();
	}

	@Override
	public String brake() {
		return "For our Mitsubishi:" + super.brake();
	}

}
