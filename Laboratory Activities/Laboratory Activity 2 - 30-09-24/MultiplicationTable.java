import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the size of the multiplication table
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        // Creating a 2D array for the multiplication table
        int[][] table = new int[size][size];

        // Filling the table with multiplication results
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[i-1][j-1] = i * j;
            }
        }

        // Printing the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print each value with at least 4 spaces for alignment
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println(); // Go to the next line after each row
        }
    }
}
