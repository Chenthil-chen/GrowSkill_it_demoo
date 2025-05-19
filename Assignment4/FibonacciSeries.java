package Assignment4;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many terms of the Fibonacci series to print
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        // Variables to store the first two Fibonacci numbers
        long first = 0, second = 1;

        // Loop to print the Fibonacci series
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            long next = first + second;
            first = second;
            second = next;
        }

        // Close the scanner
        scanner.close();
    }
}