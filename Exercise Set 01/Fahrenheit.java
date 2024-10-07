import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the Celsius value
        System.out.print("Enter a Celsius value: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Display the result with two decimal places
        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);
    }
}
