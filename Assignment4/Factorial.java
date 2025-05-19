package Assignment4;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        // Variable to store the result
        long factorial = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println("Factorial of " + num + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }
}
