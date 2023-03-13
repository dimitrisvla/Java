
public class Student {

	private String name;
	private int AM;
	private int units = 0;
	
	public Student(String name, int am) {
		this.name = name;
		this.AM = am;
	}
	
	public int getAM() {
		return AM;
	}
	
	public void addUnits(int units) {
		this.units += units;
	}

	public String toString() {
		return "Student [name=" + name + ", AM=" + AM + ", units=" + units + "]";
	}
	
	
}
