
public class myDiscountSale extends mySale {

	private double discount;
	
	public myDiscountSale(String name, double price, double discount) {
		super(name, price);
		this.discount = discount;
	}
	
	public double bill() {
		double fraction = discount/100;
		return(1-fraction)*price;
	}

	public String toString() {
		return "myDiscountSale:  [discount=" + discount + ", name=" + name + ", price=" + price + ", bill()=" + bill()
				+ "]";
	}
	
	

}
