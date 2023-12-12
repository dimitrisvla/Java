import java.util.Scanner;

public class DanceLesson2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of male and female dancers:");
		int men = input.nextInt();
		int women = input.nextInt();
		
		try {
			if(men == 0 && women == 0) {
				throw new Exception("Lesson is canceled. No students...");
			}else if(men == 0) {
				throw new Exception("Lesson is canceled. No men...");
			}else if(women == 0) {
				throw new Exception("Lesson is canceled. No women...");
			}
		
			if(women >= men) {
				System.out.println("Each man must dance with "+
									women/(double)men + " women.");
			}else {
				System.out.println("Each womanman must dance with "+
						men/(double)women + " men.");
			}
			System.out.println("Begin the lesson.");
			
		}catch(Exception e){
			String message = e.getMessage();
			System.out.println(message);
			System.exit(0);
		}

	}

}
