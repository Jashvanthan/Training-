// Example of multiple exception handling in Java
public class MultExc {
	public static void main(String[] args) {
		try {
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
			int result = 10 / 0; // ArithmeticException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index error: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("General exception: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed.");
		}
	}
}
