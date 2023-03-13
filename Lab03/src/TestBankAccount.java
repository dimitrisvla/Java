
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("Dimv", 1000);
		account.deposit(100);
		account.deposit(200);
		account.withdraw(200);
		account.printStatement();
	}

}
