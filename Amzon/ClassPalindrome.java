package Amzon;

public class ClassPalindrome {
	
	public static int reversenumber(int n)
	
	{
		int reversed_n = 0;
		while(n>0) {
			reversed_n = reversed_n*10 + n%10;
			n = n/10;
			
		}
		return reversed_n;
	}

	public static void main(String[] args) {
		
	 int n = 121;
	int reverse = reversenumber(n);
	 System.out.println("Reverse of n = " + reverse);
	 
     // Checking if n is same
     // as reverse of n
     if (n == reverse)
         System.out.println("Palindrome = Yes");
     else
         System.out.println("Palindrome = No");
	 

	}

}
