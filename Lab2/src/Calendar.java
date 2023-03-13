
public class Calendar {
	private int day = 1;
	private int month = 1;
	private int year = 2016;
	
	public Calendar(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void advanceByAMonth() {
		month++;
		if(month > 12) {
			month = 1;
			year++;
		}
	}
	
	public void advanceByADay() {
		day++;
		if(day > 30) {
			day = 1;
			advanceByAMonth();
		}
	}
	
	public void advanceByAWeek() {
		for(int i=0; i<7; i++) {
			advanceByADay();
		}
	}
	
	public void printCurrentDate() {
		System.out.println("Current date is "+ day + "/" + month + "/" + year);	
	}
	
}
