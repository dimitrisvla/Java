
public class MutualFund extends ShareAsset{

	private double number = 0;

	public MutualFund(String symbol, double currentPrice, double number) {
		super(symbol, currentPrice);
		this.number = number;
	}

	public MutualFund(String symbol, double currentPrice) {
		super(symbol, currentPrice);
	}

	public void purchase(double number, double price) {
		this.number += number;
		setCost(number*price + getCost());
	}

	@Override
	public double getMarketValue() {
		return(number*getCurrentPrice());
	}

	public double getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "MutualFund [number=" + number + ", getMarketValue()=" + getMarketValue() + ", getProfit()="
				+ getProfit() + ", getCost()=" + getCost() + ", getCurrentPrice()=" + getCurrentPrice()
				+ ", getSymbol()=" + getSymbol() + "]";
	}

	
	
}
