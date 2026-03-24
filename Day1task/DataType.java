import java.util.Scanner;
public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You entered integer: " + intValue);
        System.out.println("You entered double: " + doubleValue);
        System.out.println("You entered boolean: " + booleanValue);
        scanner.close();
    }
}