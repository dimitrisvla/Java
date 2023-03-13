
public class Employee {

	private String name;
	private int AFM;
	
	public Employee() {
		name = "No name.";
		AFM = 0;
	}

	public Employee(String name, int aFM) {
		if(name == null || aFM <= 0) {
			System.out.println("Fatal Error creating employee...");
			System.exit(0);
		}
		this.name = name;
		AFM = aFM;
	}
	
	public Employee(Employee originalObject) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAFM() {
		return AFM;
	}

	public void setAFM(int aFM) {
		AFM = aFM;
	}

	public String toString() {
		return "Employee [name=" + name + ", AFM=" + AFM + "]";
	}
	
	
	
}
