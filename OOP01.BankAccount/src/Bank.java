
public class Bank {

	public static void main(String[] args) {
		BankAccount accountJim = new BankAccount();
		
		accountJim.setAccountName("Jim Vlachos");
		System.out.println("Account name: " + accountJim.getAccountName());
		
		accountJim.setBalance(1000);
		System.out.println("Account balance : " + accountJim.getBalance());
		
		accountJim.setAccountEmail("benovla@yahoo.gr");
		System.out.println("Account mail: " + accountJim.getAccountEmail());
		
		accountJim.depositfunds(400);
		System.out.println("Account balance after deposit :" + accountJim.getBalance());
		
		accountJim.withdrawfunds(870);
		System.out.println("Account balance after withdraw :" + accountJim.getBalance());
		
		accountJim.withdrawfunds(955.5);
		System.out.println("Account balance after withdraw :" + accountJim.getBalance());
	}

}
