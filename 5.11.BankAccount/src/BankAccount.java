import java.util.Objects;

public class BankAccount {
	private String name;
	private int amount;
	

	public BankAccount(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}
	
	public void merge(BankAccount other) {
		if(this.name.equals(other.name)) {
			this.amount += other.amount;
		}
	}

	public BankAccount mergeIntoNewAccount(BankAccount other) {
		if(this.name.equals(other.name)) {
			BankAccount newAccount = new BankAccount(name,this.amount + other.amount);
			return newAccount;
		}
		return null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
