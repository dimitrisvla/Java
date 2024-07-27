
public class Cash implements Asset{
	
	private double amount = 0;

	public Cash(double amount) {
		this.amount = amount;
	}

	public double getMarketValue() {
		return amount;
	}
	
	public double getProfit() { // no profit
		return 0;
	}
	
	@Override
	public String toString() {
		return "Cash [amount=" + amount + "]";
	}
	
}
