import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please give the number of persons: ");
		int n = scanner.nextInt();
		String [][] nameArray = new String [n][2];
		
		System.out.println("Please give the names for each person: ");
		for(int i=0; i<n; i++) {
			nameArray[i][0] = scanner.next(); // Onoma
			nameArray[i][1] = scanner.next(); // Epwnumo			
		}
		
		for(int i=0; i<n; i++) { //print onoma & epwnymo
			System.out.println(nameArray[i][0] +" "+ nameArray[i][1]);
		}
	}

}
