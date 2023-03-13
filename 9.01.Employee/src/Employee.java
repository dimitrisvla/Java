
public class Employee {

	private String name;
	private Date hiredate;
	

	public Employee(String name, Date hiredate) {
		super();
		this.name = name;
		this.hiredate = hiredate;
	}


	public String toString() {
		return "Employee: [name=" + name + ", hiredate=" + hiredate + "]";
	}
	
}
