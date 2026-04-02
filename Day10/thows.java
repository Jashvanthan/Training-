// Example of using 'throws' in Java
import java.io.IOException;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		}
	}

	// Method declares that it may throw IOException
	public static void readFile() throws IOException {
		throw new IOException("File not found");
	}
}
