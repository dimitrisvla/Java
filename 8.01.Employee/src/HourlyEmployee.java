
public class HourlyEmployee extends Employee {

	private double wageRate;
	private double hours;  // for the month	
	
	public HourlyEmployee() {
		wageRate = 0;
		hours = 0;
	}
	
	public HourlyEmployee(Employee originalObject) {
		super(originalObject);
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(String name, int aFM, double wageRate, double hours) {
		super(name, aFM);
		if(wageRate >=0 && hours >=0) {
			this.wageRate = wageRate;
			this.hours = hours;
		}else {
			System.out.println("Fatal Error creating hourly employee...");
			System.exit(0);
		}
	}

	public double getWageRate() {
		return wageRate;
	}

	public void setWageRate(double wageRate) {
		this.wageRate = wageRate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getPay() {
		return (double)wageRate*hours;
	}

	public String toString() {
		return "HourlyEmployee [wageRate=" + wageRate + ", hours=" + hours + ", toString()=" + super.toString() + "]";
	}
	
	
}
