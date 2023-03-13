
public class StudentRecord {
	
	private Student student;
	private double grade;
	
	public StudentRecord(Student s) {
		student = s;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public Student getStudent() {
		return student;
	}

	public String toString() {
		return "StudentRecord [student=" + student + ", grade=" + grade + "]";
	}
	
	public boolean passed() {
		if(grade >= 5) {
			return true;
		}
		return false;
	}
	
}
