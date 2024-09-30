import java.util.Scanner;

public class GetArrayMean {
    // Function to calculate the mean of the array
    public static double getArrayMean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the number of elements
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Initializing the array
        int[] numbers = new int[n];

        // Filling the array with input values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        // Calculating and printing the mean
        double mean = getArrayMean(numbers);
        System.out.printf("Mean of array is: %.2f", mean);
    }
}
