import java.util.Scanner;
public class Mathematical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Calculate the perimeter of a rectangle");
        System.out.println("2. Calculate the area of a square");
        System.out.println("3. Calculate the area of a rectangle");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                double perimeter = 2 * (length + width);
                System.out.println("The perimeter of the rectangle is: " + perimeter);
                break;
            case 2:
                System.out.print("Enter the side length of the square: ");
                double side = sc.nextDouble();
                double areaSquare = side * side;
                System.out.println("The area of the square is: " + areaSquare);
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double lengthRect = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double widthRect = sc.nextDouble();
                double areaRect = lengthRect * widthRect;
                System.out.println("The area of the rectangle is: " + areaRect);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}