
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
			

}
