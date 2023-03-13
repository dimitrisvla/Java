
public class BankAccount {

	private String accountName;
	private int accountMoney;
	
	public BankAccount(String accountName, int accountMoney) {
		this.accountName = accountName;
		this.accountMoney = accountMoney;

	}
	
	public void deposit(int depositMoney) {
		accountMoney += depositMoney;
	}
	
	public int withdraw(int withdrawMoney) {
		if(accountMoney >= withdrawMoney) {
			accountMoney -= withdrawMoney;
			return accountMoney;
		}else {
			return 0;
		}
	}
	
	public void printStatement() {
		System.out.println("Name: " + accountName + " balance: " + accountMoney);
	}
	
}
