
public class DividendStock extends Stock{

	private double dividends = 0;

	public DividendStock(String symbol, double currentPrice, int number) {
		super(symbol, currentPrice, number);
	}
	
	public DividendStock(String symbol, double currentPrice) {
		super(symbol, currentPrice);
	}
	
	public void payDividends(double amountPerShare) {
		dividends += amountPerShare*getNumber();
	}
	
	public double getMarketValue() {
		return super.getMarketValue() + dividends;
	}

	@Override
	public String toString() {
		return "DividendStock ["+ super.toString() +" dividends=" + dividends + "]";
	}
	
	
}
