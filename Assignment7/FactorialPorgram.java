package Assignment7;

import java.util.Scanner;

public class FactorialPorgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter the number :");
		
		int num = scanner.nextInt();
		
		if(num < 0) {
			
			System.out.println(" factorial is not devfined for negative number");
			
		}
		
		else {
			 long factorial = 1;
			 
			 for(int i =1 ; i<=num;i++) {
				   factorial *= i;
			 }
				 
				 System.out.println("The factorial of " +  num  + " is " + factorial);
			 }
		
		
		scanner.close();
		
		

	}

}
