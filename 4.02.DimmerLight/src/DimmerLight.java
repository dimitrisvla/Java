
public class DimmerLight {
	private boolean lightIsOn = false;
	private int intensity = 100;
	
	public void flipSwitch() {
		lightIsOn = !lightIsOn;
	}
	
	public void dim() {
		if(intensity > 0) {
			intensity--;
		}
	}
	
	public void brighten() {
		if(intensity < 100) {
			intensity++;
		}
	}
	
	public void printState() {
		if(lightIsOn) {
			System.out.println("The light is on with intensity " + intensity);
		}else {
			System.out.println("The light is off");
		}
	}
}
