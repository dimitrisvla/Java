
public class CalendarTest {

	public static void main(String[] args) {
		Calendar myCalendar = new Calendar(1, 1, 2015);
		myCalendar.printCurrentDate();
		
		for(int i=0; i<12; i++) {
			myCalendar.advanceByAMonth();
			myCalendar.printCurrentDate();
		}
		
		for(int i=0; i<31; i++) {
			myCalendar.advanceByADay();
			myCalendar.printCurrentDate();
		}
		
		for(int i=0; i<5; i++) {
			myCalendar.advanceByAWeek();
			myCalendar.printCurrentDate();
		}
	}

}
