import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {
		String name = "Dim";
		BankAccount account = new BankAccount(name);
		double myMoney = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.print("Give your name: ");
		String username = input.next();
		
		if (username.equals(account.getAccountName())){
			account.deposit(100);
			myMoney += account.withdraw(50);
			account.deposit(100);
			myMoney += account.withdraw(200);
			account.printStatement();
			System.out.println("You have "+ myMoney + " dollars in your pocket");
		}else {
			System.out.println("There is not an account with that name");
		}
	
		
	}

}
