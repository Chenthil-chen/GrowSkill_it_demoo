package Assignment4;

import java.util.Scanner;

public class EvenOddCheck {

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is even or odd using the modulus operator
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }
}