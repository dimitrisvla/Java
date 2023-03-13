
public class Student {

	private String name = "John Doe";
	private int AM = 1000;
	
	public Student(String name, int AM) {
		this.name = name;
		this.AM = AM;
	}
	
	public void printInfo() {
		System.out.println(name + " " + AM);
	}
	
	public static void main(String[] args) {
		Student aStudent = new Student("Kostas", 1001);
		aStudent.printInfo();
	}

}
