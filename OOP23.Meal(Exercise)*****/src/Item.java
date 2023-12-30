
public class Item {

	private String name;
	private String type;
	private double price;
	private String size = "";
	
	public Item(String name, String type, double price) {
		this.name = name.toUpperCase();
		this.type = type.toUpperCase();
		this.price = price;
		size = "SMALL";
	}

	public double getBasePrice() {
		return price;
	}

	
	public String getName() {
		if (type.equals("SIDE") || type.equals("DRINK")) {
	        return size + " " + name;
	    }
		return name;
	}
	
	public void setSize(String size) {
        this.size = size;
    }
	
	public double getAdjustedPrice() {
        return switch (size) {
            case "MEDIUM" -> getBasePrice() + 1.0;
            case "LARGE" -> getBasePrice() + 2.0;
            default -> getBasePrice();
        };
    }
	
	 public static void printItem(String name, double price) {
	     System.out.printf("%10s:%5.2f%n", name, price);
	 }

	 public void printItem() {
         printItem(getName(), getAdjustedPrice());
	  }
	
	
}
