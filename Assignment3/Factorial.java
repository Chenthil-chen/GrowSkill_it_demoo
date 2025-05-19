package Assignment3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a number
		 
	        System.out.print("Enter a number: ");
	        int num =4;
	        
	        // Check if the number is negative
	        if (num < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            // Variable to store the result
	            long factorial = 1;
	            
	            // Use a loop to calculate the factorial
	            for (int i = 1; i <= num; i++) {
	                factorial *= i;
	            }
	            
	            // Output the factorial of the number
	            System.out.println("The factorial of " + num + " is " + factorial);
	        }

	        // Close the scanner
	        scanner.close();
	    }
	
	

}
