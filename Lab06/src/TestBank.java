
class TestBank
{
	public static void main(String[] args){
		//Bank centralBank = new Bank();
		String name1 = "Professor";
		BankAccount professorAccount = new BankAccount(name1);
		professorAccount.deposit(1000);
		BankCheck check = new BankCheck(name1, 200);
		professorAccount.deposit(check);
		professorAccount.withdraw(500);
		//centralBank.addAccount(professorAccount);
		
		String name2 = "Jim";
		BankAccount professorAccount2 = new BankAccount(name2);
		professorAccount2.deposit(1000);
		//centralBank.addAccount(professorAccount2);
		
		String name3 = "Tokyo";
		BankAccount tokyoAccount = new BankAccount(name3);
		tokyoAccount.deposit(1500);
		//centralBank.addAccount(tokyoAccount);
		
		String name4 = "Denver";
	    BankAccount denverAccount = new BankAccount(name4);
		denverAccount.deposit(2500);
		//centralBank.addAccount(denverAccount);	
		
		//centralBank.printAccountStatement("Rio");
		System.out.println();
		//centralBank.printAccountStatement("Professor");
		System.out.println();
		
		//centralBank.printAccounts();
	}
}