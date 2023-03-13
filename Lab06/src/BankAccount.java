import java.util.ArrayList;

class BankAccount
{
	private String name;
	private double balance;
	private ArrayList<String> log = new ArrayList<String>();
	
	public BankAccount(String name){
		this.name = name;
	}
	
	public void deposit(double amount){
		balance += amount;
		log.add(amount + "euros deposited.");
	}
	
	public boolean deposit(BankCheck check){
		if (this.name.equals(check.getPayeeName())){
			balance += check.getAmount();
			log.add(check.getPayeeName() + "euros deposited from " + this.name);
			return true;
		}
		return false;
	}
	
	public double withdraw(double amount){
		if (balance < amount){
			return 0;
		}else{
			balance -= amount;
			log.add(balance + "euros withdrawn.");
			return amount;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void printStatement(){
		System.out.println(name+" account: ");
		System.out.println("The balance in the account is "+balance+" euros");
		
		System.out.println("Transactions: ");
		for (String x:log){
			System.out.println(x);
			}
	}
	
	public String toString(){
		return name+" account";
	}
	
}