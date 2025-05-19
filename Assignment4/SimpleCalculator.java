package Assignment4;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

      
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

       
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}