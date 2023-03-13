
public class mySale {

	protected String name;
	protected double price;
	
	public mySale(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "mySale:  [name=" + name + ", and total price(cost)=" + price + "]";
	}
	
	public double bill() {
		return price;
	}
	
	public boolean equalDeals(mySale otherSale) {
		return((name.equals(otherSale.name)) && (this.bill()<otherSale.bill()));
	}
	
	public boolean lessThan(mySale otherSale) {
		return (this.bill() < otherSale.bill());
	}
	
}
