
public class Ford extends Car{

	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "For our Ford:" + super.startEngine();
	}

	@Override
	public String accelerate() {
		return "For our Ford:" + super.accelerate();
	}

	@Override
	public String brake() {
		return "For our Ford:" + super.brake();
	}
}
