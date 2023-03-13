
public class Car {
	
	private int position = 0;
	
	public Car(int position) {
		this.position = position;
	}
	
	public int getPosition(){
		return position;
	}
	
	public void move(int delta) {
		position += delta;
	}
	
}
