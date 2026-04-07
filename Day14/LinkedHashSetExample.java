import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        Set<String> fruits = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana"); // Duplicate, will not be added

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + fruits);

        // Check if an element exists
        if (fruits.contains("Apple")) {
            System.out.println("LinkedHashSet contains Apple");
        }

        // Remove an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterate over elements
        System.out.println("Iterating over LinkedHashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
