package Assignment4;

import java.util.Scanner;

public class MetersToCentimeters {

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a value in meters
        System.out.print("Enter the length in meters: ");
        double meters = scanner.nextDouble();

        // Convert meters to centimeters (1 meter = 100 centimeters)
        double centimeters = meters * 100;

        // Output the result
        System.out.println(meters + " meters is equal to " + centimeters + " centimeters.");

        // Close the scanner
        scanner.close();

}
}
