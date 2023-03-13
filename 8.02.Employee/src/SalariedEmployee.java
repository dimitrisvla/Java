
public class SalariedEmployee extends Employee{

	private double salary;
	
	public SalariedEmployee(SalariedEmployee other) {
		super(other);
		this.salary = other.salary;
	}
	
	
}
