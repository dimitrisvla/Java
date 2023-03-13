
public class Car extends Vehicle{
	
	private int gas;

	public Car(int pos, int gas) {
		super(pos);
		this.gas = gas;
	}


	public void move() {
		setPosition(getPosition() + 10);
		gas -= 10;
	}


	public int getGas() {
		return gas;
	}
	
	public void printf() {
		super.print();
		System.out.println("gas = " + gas);
	}
}
