public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("Dimv", 1000);
		account.deposit(100);
		account.deposit(200);
		account.withdraw(200);
		account.printStatement();
		account.withdraw(1500);
		account.printStatement();
		
		BankAccount account2 = new BankAccount("Kostas", 0);
		account2.deposit(100);
		account2.deposit(200);
		account2.withdraw(200);
		account2.printStatement();
	}

}

