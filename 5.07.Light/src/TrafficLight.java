
public class TrafficLight {

	boolean isLightRed = false;
	
	public void change() {
		isLightRed =! isLightRed;
	}
	
	public boolean isRed() {
		return isLightRed;
	}
	
	public void printStatus() {
		if(isLightRed) {
			System.out.println("Traffic light is red");
		}else {
			System.out.println("Traffic light is green");
		}
	}
}
