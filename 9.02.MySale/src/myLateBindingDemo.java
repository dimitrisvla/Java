
public class myLateBindingDemo {

	public static void main(String[] args) {
		mySale simple = new mySale("floor mat", 10.00);
		myDiscountSale discount = new myDiscountSale("Floor mat", 11.00, 10);
		
		System.out.println(simple);
		System.out.println(discount);
		
		if(discount.lessThan(simple)) {
			System.out.println("Discounted item is cheaper");
		}else {
			System.out.println("Discounted item is not cheaper");
		}

		mySale regularPrice = new mySale("cup holder", 9.90);
		myDiscountSale specialPrice = new myDiscountSale("cup holder", 11.00, 10);
		
		System.out.println(regularPrice);
		System.out.println(specialPrice);
		
		if(specialPrice.equalDeals(regularPrice)) {
			System.out.println("Deals are equal.");
		}else {
			System.out.println("Deals are not equal.");
		}
	}

}
