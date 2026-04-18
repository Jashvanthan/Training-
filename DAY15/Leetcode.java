// LeetCode Climbing Stairs Problem Solution
public class Leetcode {
	// Returns the number of distinct ways to climb to the top
	public int climbStairs(int n) {
		if (n <= 2) return n;
		int first = 1, second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}
}

	// Example usage
