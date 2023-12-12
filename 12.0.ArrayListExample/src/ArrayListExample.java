
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // Access elements in the ArrayList
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Iterate over the ArrayList
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if an element exists in the ArrayList
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Remove an element from the ArrayList
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Clear all elements from the ArrayList
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}
