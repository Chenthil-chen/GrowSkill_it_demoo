package Assignment4;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of natural numbers to sum
        System.out.print("Enter a number to find the sum of natural numbers: ");
        int n = scanner.nextInt();

        // Variable to store the sum
        int sum = 0;

        // Loop to calculate the sum of natural numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number to the sum
        }

        // Output the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}