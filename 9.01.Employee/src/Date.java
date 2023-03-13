
public class Date {

	private int day = 1;
	private int month = 1;
	private int year = 1999;
	private String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
								   "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	
	public Date(int day, int month, int year) {
		if(day <= 0 || day > 31 || month <= 0 || month > 12) {
			return;
		}
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void printDate() {
		System.out.println(day + " " + monthNames[month-1] + " " + year);
	}
	
}