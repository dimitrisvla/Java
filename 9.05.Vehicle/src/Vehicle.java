
public abstract class Vehicle {

	protected int position = 0;

	public Vehicle() {
		
	}

	public Vehicle(int position) {
		super();
		this.position = position;
	}
	
	public abstract void move();
	
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void print() {
		System.out.println("position: " + position);
	}
}
