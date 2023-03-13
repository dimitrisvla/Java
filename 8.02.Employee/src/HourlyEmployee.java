
public class HourlyEmployee extends Employee{

	private double wageRate;
	private double hours;
	
	public HourlyEmployee(String theName, Date hireDate, double wageRate, double hours) {
		name = theName;
		hireDate = new Date(hireDate);
		this.wageRate = wageRate;
		this.hours = hours;
	}
	
	
}
