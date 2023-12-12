
public class BankAccount {
	private int accountNumber;
	private double balance = 0;
	private String accountName;
	private String accountEmail;
	private int phoneNumber;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountEmail() {
		return accountEmail;
	}
	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositfunds(double funds) {
		balance += funds;
	}
	
	public void withdrawfunds(double funds) {
		if(balance < funds) {
			System.out.println("Not enough funds for withdraw.");
			return;
		}
		balance -= funds;
	}
}
