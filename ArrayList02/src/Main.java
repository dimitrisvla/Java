import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
	
	public GroceryItem(String name) {
		this(name, "Vasilopoulos", 1);
	}
	
	@Override
    public String toString() {
        return String.format("%d %s by %s", count, name.toUpperCase(), type);
    }
}


public class Main {

	public static void main(String[] args) {
		GroceryItem[] groceryArray = new GroceryItem[3];
		groceryArray[0] = new GroceryItem("milk");
		groceryArray[1] = new GroceryItem("apples", "Vasilopoulos", 4);
		groceryArray[2] = new GroceryItem("oranges", "Vasilopoulos", 5);
		System.out.println(Arrays.toString(groceryArray));
		
		ArrayList objectList = new ArrayList();
		objectList.add(new GroceryItem("Ice cream"));
		objectList.add("Gyros Chicken");
		
		ArrayList<GroceryItem> groceryList = new ArrayList<>();
		groceryList.add(new GroceryItem("Ice cream"));
		groceryList.add(new GroceryItem("Gyros Chiken"));
		groceryList.add(new GroceryItem("milk","Olymbos", 3));
		groceryList.set(0, new GroceryItem("apples", "Vasilopoulos", 5));
		groceryList.remove(1);
		System.out.println(groceryList);

	}

}
