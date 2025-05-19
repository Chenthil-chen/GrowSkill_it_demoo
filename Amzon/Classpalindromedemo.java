package Amzon;

public class Classpalindromedemo {
	
	static int reversenumber(int n)
	{
	int reversed_n = 0;
	while (n>0)
	{ 
		reversed_n = reversed_n * 10 + n%10;
		n = n/10;
	}
	return  reversed_n ;
	}	

public static void main(String[] args) {
	
		int n = 323;
		int rever = reversenumber(n);
		
		System.out.println("Reverse of N " +rever );
		if (n==rever)
		System.out.println("palindrome = yes");
		else
		System.out.println("palindrome = yes");

	}
}


