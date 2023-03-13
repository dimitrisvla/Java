
public class SalariedEmployee extends Employee{

	private double salary;

	public SalariedEmployee(String name, int AFM, double salary) {
		super(name, AFM);
		if(salary >= 0) {
			this.salary = salary;
		}else {
			System.out.println("Fatal Error creating salaried employee...");
			System.exit(0);
		}
	}
	
	
	public SalariedEmployee() {
		this("no name", 0, 0);
	}
	
	public SalariedEmployee(SalariedEmployee originalObject) {
		//
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getPay() {
		return salary/12;
	}

	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
