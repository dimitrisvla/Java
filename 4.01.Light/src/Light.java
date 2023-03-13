
public class Light {

	private boolean lightIsOn = false;
	
	public void flipSwitch() {
		lightIsOn = !lightIsOn;
	}
	
	public void printState() {
		if(lightIsOn) {
			System.out.println("The light is on");
		}else {
			System.out.println("The light is off");
		}
	}
}
