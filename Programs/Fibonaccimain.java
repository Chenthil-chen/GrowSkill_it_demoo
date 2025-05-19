package Programs;

import java.util.Scanner;

public class Fibonaccimain {
	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the fiboancci term ");
			
			int term = scanner.nextInt();
			
			long first = 0 , second = 1;
			
			
		
			
			
			
			
			for(int i =0;i<=term ;i++) {
				System.out.println(first + " ");
				long next = first + second;
				
				first = second;
				
				
				second =  next;
				
				
				
			}
			
		scanner.close();

	}
		

}
