import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		// Create a HashSet of integers
		Set<Integer> numbers = new HashSet<>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2); 
		System.out.println("HashSet: " + numbers);
		if (numbers.contains(2)) {
			System.out.println("HashSet contains 2");
		}
		numbers.remove(3);
		System.out.println("After removing 3: " + numbers);
		System.out.println("Iterating over HashSet:");
		for (int num : numbers) {
			System.out.println(num);
		}
	}
}
