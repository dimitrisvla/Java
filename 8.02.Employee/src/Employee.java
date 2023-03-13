
public class Employee {
	protected String name = "default";
	protected Date hireDate = new Date(11,4,2018);
	
	public Employee() {
		System.out.println("Empty Employee constructor");
	}

	public Employee(String name, Date theDate) {
		this.name = name;
		hireDate = new Date(theDate);
	}

	public Employee(Employee other) {
		this.name = other.name;
		this.hireDate = other.hireDate;
	}	
	
	
}
