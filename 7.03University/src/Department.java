import java.util.Scanner;

public class Department {

	public static void main(String[] args) {
		System.out.println("Please give the number of students: ");
		Scanner inputStudents = new Scanner(System.in);
		int numOfStudents = inputStudents.nextInt();
		//int numOfStudents = Integer.parseInt(args[0]);
		
		Professor profX = new Professor("Prof XXX", 2012);
		Professor profY = new Professor("Prof YYY", 2014);
		
		Course oop = new Course("oop", 212, 10);
		Course intro = new Course("Intro to cs", 101, 5);
		
		Student[] students = new Student[numOfStudents];
		Scanner input = new Scanner(System.in);
		for(int i=0; i<numOfStudents; i++) {
			System.out.print("Give student name: ");
			String name = input.next();
			students[i] = new Student(name, i);
		}
		
		oop.setProf(profX);
		oop.enroll(students[0]); oop.enroll(students[1]); oop.enroll(students[2]);
		
		intro.setProf(profY);
		intro.enroll(students[0]); intro.enroll(students[1]); intro.enroll(students[2]);
		
		oop.assignGrades(); intro.assignGrades();
		
		System.out.println(profX); System.out.println(profY);
		oop.printInfo(); oop.printInfo();
	}

}
