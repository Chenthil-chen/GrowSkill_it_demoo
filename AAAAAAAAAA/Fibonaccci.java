package AAAAAAAAAA;

import java.util.Scanner;

public class Fibonaccci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enbter the fibo");
		
		int num = 3;
		
		long first =0, secind = 1;
		 
		for(int i=0;i<=num;i++) {
			System.out.println(first +" ");
			
			long next = first +secind;
			
			first = secind;
			secind = next;
			
			
		}
		scanner.close();

	}

}
