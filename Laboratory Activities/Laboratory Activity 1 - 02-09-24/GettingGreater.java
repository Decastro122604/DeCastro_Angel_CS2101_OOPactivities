import java.util.Scanner;

public class GettingGreater {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        //Getting the first character input
        System.out.print("Enter first character: ");
        char ch1 = scanner.next().charAt(0);
        
        //Getting the second character input
        System.out.print("Enter second character: ");
        char ch2 = scanner.next().charAt(0);
        
        //Determining the greater character by ASCII value
        char greaterChar = (char) Math.max(ch1,ch2);
        
        //Display the results
System.out.println("\n----------------------------------------");
        System.out.println("The character with the greater value is: " +greaterChar);
        System.out.println("\nShowing the ASCII Codes");
        System.out.println(ch1+":"+(int)ch1);
        System.out.println(ch2+":"+(int)ch2);
        
        scanner.close();
    }
}
