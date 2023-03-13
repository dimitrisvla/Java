import java.util.ArrayList;
import java.util.Scanner;

public class Course {

	private String name;
	private int code;
	private int units;
	private Professor prof;
	private ArrayList<StudentRecord> studentlist = new ArrayList<StudentRecord>();
	
	public Course(String name, int code, int units) {
		this.name = name;
		this.code = code;
		this.units = units;
	}
	
	public void setProf(Professor p) {
		prof = p;
		p.setLesson(this);
	}
	
	public void enroll(Student s) {
		studentlist.add(new StudentRecord(s));
	}
	
	public void assignGrades() {
		System.out.println("Give grades for course " + toString());
		Scanner input = new Scanner(System.in);
		for(StudentRecord record: studentlist) {
			System.out.println("Give grade for student " + record.getStudent().getAM() + ":");
			double grade = input.nextDouble();
			record.setGrade(grade);
			if(record.passed()) {
				record.getStudent().addUnits(units);
			}
		}
	}

	public String toString() {
		return "Course [name=" + name + ", code=" + code + ", units=" + units + "]";
	}
	
	public void printInfo() {
		System.out.println("Course" + name + " " + code + "("+ units + ")");
		for(StudentRecord r: studentlist) {
			System.out.println(r);
		}
	}
	
}
