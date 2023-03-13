
public class HourlyEmployee extends Employee {

	private double wageRate;
	private double hours;
	
	
	public HourlyEmployee(String name, Date hiredate , double wageRate, double hours) {
		super(name, hiredate);
		this.wageRate = wageRate;
		this.hours = hours;
	}
	

	public String toString() {
		return "HourlyEmployee: " + super.toString() + "[wageRate=" + wageRate + ", hours=" + hours + "]";
	}
	
}
