
public class BankAccount {

	private String accountName;
	private int accountMoney = 0;
	
	public BankAccount(String accountName) {
		this.accountName = accountName;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	
	public void deposit(int depositMoney) {
		accountMoney += depositMoney;
	}
	
	public boolean deposit(BankCheck check){
		if (this.accountName.equals(check.getPayee())){
			accountMoney += check.getPay();
			return true;
		}
		return false;
	}
	
	public int withdraw(int withdrawMoney) {
		if(accountMoney >= withdrawMoney) {
			accountMoney -= withdrawMoney;
			return accountMoney;
		}else {
			System.out.println("Not enough money available.");
			return 0;
		}
	}
	
	public void printStatement() {
		System.out.println("Name: " + accountName + "   "  + " balance: " + accountMoney + " $" );
	}

	public String toString() {
		return "BankAccount [accountName=" + accountName + "]";
	}
	
	
}
