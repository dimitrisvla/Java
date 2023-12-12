
import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        set.add("Mango");

        // Print the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element exists in the HashSet
        String searchElement = "Orange";
        if (set.contains(searchElement)) {
            System.out.println(searchElement + " is found in the HashSet");
        } else {
            System.out.println(searchElement + " is not found in the HashSet");
        }

        // Remove an element from the HashSet
        String removeElement = "Banana";
        boolean removed = set.remove(removeElement);
        if (removed) {
            System.out.println(removeElement + " is removed from the HashSet");
        } else {
            System.out.println(removeElement + " is not found in the HashSet");
        }

        // Print the updated HashSet
        System.out.println("Updated HashSet: " + set);

        // Get the size of the HashSet
        int size = set.size();
        System.out.println("Size of the HashSet: " + size);

        // Clear the HashSet
        set.clear();

        // Check if the HashSet is empty
        boolean isEmpty = set.isEmpty();
        if (isEmpty) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet is not empty");
        }
    }
}

