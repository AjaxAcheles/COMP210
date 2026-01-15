package lec03;
import java.util.Scanner;

public class assn01t {
    public static void main(String[] args) {
        // Print "Hello, World"
        System.out.println("Hello, World");

        // Create a Scanner object to get user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int n = s.nextInt();

        // If n == 1, print "Hello, World" inside the main method
        if (n == 1) {
            System.out.println("Hello, World");
        }
        // If n == 2, prompt the user to enter two doubles and an integer
        else if (n == 2) {
            System.out.print("Enter the first double: ");
            double a = s.nextDouble();

            System.out.print("Enter the second double: ");
            double b = s.nextDouble();

            System.out.print("Enter an integer: ");
            int m = s.nextInt();

            // Print the values as specified
            System.out.printf("a = %.1f, b = %.1f, m = %d\n", a, b, m);
        }

        // Close the Scanner object
        s.close();
    }
}
