
public class BankCheck {
	String payee;
	double pay;
	
	public BankCheck(String payee, double pay) {
		super();
		this.payee = payee;
		this.pay = pay;
	}

	public String getPayee() {
		return payee;
	}
	public double getPay() {
		return pay;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public String toString() {
		return "BankCheck [Check  to " + payee + " " + pay + "E]";
	}

	public boolean equals(BankCheck other){
		return (this.payee.equals(other.payee) && this.pay == other.pay);
	}

	
	
	
}
