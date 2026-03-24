import java.util.*;
public class Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Using for loop:");
        for (int i = 0; i < num; i++) {
            System.out.println("Iteration: " + (i + 1));
        }

        System.out.println("\nUsing while loop:");
        int count = 0;
        while (count < num) {
            System.out.println("Iteration: " + (count + 1));
            count++;
        }

        System.out.println("\nUsing do-while loop:");
        count = 0;
        do {
            System.out.println("Iteration: " + (count + 1));
            count++;
        } while (count < num);

        sc.close();
    }
}