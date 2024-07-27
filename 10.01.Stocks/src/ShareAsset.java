
public abstract class ShareAsset implements Asset{

	private String symbol;
	private double cost = 0;
	private double currentPrice;
	
	public ShareAsset(String symbol, double currentPrice) {
		super();
		this.symbol = symbol;
		this.currentPrice = currentPrice;
	}
	
	public abstract double getMarketValue();
	
	public double getProfit() {
		return (getMarketValue() - cost);
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost += cost;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getSymbol() {
		return symbol;
	}
	
	
}
