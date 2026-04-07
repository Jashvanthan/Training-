import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);
        scores.put("Bob", 88); 
        System.out.println("HashMap: " + scores);
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);
        if (scores.containsKey("Charlie")) {
            System.out.println("HashMap contains Charlie");
        }
        scores.remove("Bob");
        System.out.println("After removing Bob: " + scores);
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
