import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        // Display the welcome message
        System.out.println("Welcome to CS 211: Object-oriented Programming!");

        // Create a scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Output the customized message
        System.out.println("This course will be fun, " + name + "!");
    }
}
