import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
		String name = "Dim";
		BankAccount mybankaccount = new BankAccount(name);
		mybankaccount.deposit(1000);
		double myMoney = 0.0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Give your name: ");
		String username = input.next();
		BankCheck mybankcheck = new BankCheck(username, 200);
		
		while(!mybankaccount.equals(mybankcheck)) {
			System.out.print("Cannot deposit check. Give the correct payee name\n");
			username = input.next();
			mybankcheck.setPayee(username);
		}
		System.out.println("Succesfull deposit complete.");
		
		BankCheck mysecondbankcheck = new BankCheck(name, 200);
		if (mybankcheck.equals(mysecondbankcheck)) {
			System.out.println("Check "+ mysecondbankcheck + " has already been deposited");
		}else {
			mybankaccount.deposit(mysecondbankcheck);
		}
		
	}

}
