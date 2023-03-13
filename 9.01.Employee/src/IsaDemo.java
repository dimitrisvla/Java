
public class IsaDemo {

	public static void main(String[] args) {
		
		HourlyEmployee alice = new HourlyEmployee("Alice", new Date(11,4,2015), 50.5, 40);
		SalariedEmployee bob = new SalariedEmployee("Bob", new Date(1,1,2017), 600);
		
		System.out.println("showEmployee(alice):");
		showEmployee(alice);
		
		System.out.println("showEmployee(bob):");
		showEmployee(bob);

	}
	
	public static void showEmployee(Employee employeeObject) {
		System.out.println(employeeObject);
	}

}
