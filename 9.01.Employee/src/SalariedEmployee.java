
public class SalariedEmployee extends Employee{

	private double salary;

	public SalariedEmployee(String name, Date hiredate, double salary) {
		super(name, hiredate);
		this.salary = salary;
	}


	public String toString() {
		return "SalariedEmployee: [salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	
	
}
