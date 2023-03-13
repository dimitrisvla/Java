
public class ChronoTest {

	public static void main(String[] args) {
		
		Chronometer timer = new Chronometer();
		
		for(int i=0; i<100; i++) {
			timer.tick();
		}
		
		timer.printTimePassed();
		
	}

}
