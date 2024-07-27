
public class Stock extends ShareAsset{

	private int number = 0;

	public Stock(String symbol, double currentPrice, int number) {
		super(symbol, currentPrice);
		this.number = number;
		setCost(number*currentPrice);
	}
	
	public Stock(String symbol, double currentPrice) {
		super(symbol, currentPrice);
	}
	
	public void purchase(int number, double price) {
		this.number += number;
		setCost(number*price + getCost());
	}
	
	@Override
	public double getMarketValue() {
		return(number*getCurrentPrice());
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Stock: [number=" + number + ", getMarketValue()=" + getMarketValue() + ", getProfit()=" + getProfit()
				+ ", getCost()=" + getCost() + ", getCurrentPrice()=" + getCurrentPrice() + ", getSymbol()="
				+ getSymbol() + "]";
	}
	
	

}
