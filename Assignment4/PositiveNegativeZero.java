package Assignment4;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is positive, negative, or zero
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }

        // Close the scanner
        scanner.close();
    }
}