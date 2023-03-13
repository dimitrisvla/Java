
public class Date {

	private int day = 1;
	private int month = 1;
	private int year = 1999;
	private String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
								   "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	
	public Date(int day, int month, int year) {
		if(checkDay(day)) {
			this.day = day;
		}
		if(checkMonth(month)) {
			this.month = month;
		}	
		this.year = year;
	}
	
	private boolean checkDay(int day) {
		if(day <= 0 || day > 31) {
			return false;
		}
		return true;
	}
	
	private boolean checkMonth(int month) {
		if(month <= 0 || month > 12) {
			return false;
		}
		return true;
	}
	
	public void printDate() {
		System.out.println(day + " " + monthNames[month-1] + " " + year);
	}
	
}