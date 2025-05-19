package AAAAAAAAAA;

import java.util. Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scanner = new  Scanner(System.in) ;
          
          System.out.println("enter the fac");
          int num = scanner.nextInt();
          
          long factorial = 1;
          
          for (int i=1;i<=num;i++) {
        	   factorial *=i;
        	   
        	   
        	 
        	 
         }
          
          System.out.println("the fact" + num + "is " + factorial);
          scanner.close();
	}
	
   
}
