
public class Chronometer {
	
	private int seconds = 0;
	private int minutes = 0;
	
	public void tick() {
		if(seconds < 59) {
			seconds++;
		}else if(minutes < 59) {
			seconds = 0;
			minutes++;
		}else {
			minutes = seconds = 0;
		}
	}
	
	public void reset() {
		seconds = 0;
		minutes = 0;
	}
	
	public void printTimePassed() {
		System.out.println(minutes + " minute(s) and " + seconds + " seconds");
	}
}
