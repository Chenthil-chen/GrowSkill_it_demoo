package Amzon;

public class ClassStringPalindrome {
	
	public static boolean ispalindrome (String s)
	{
		s = s.toLowerCase();
		
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev +s.charAt(i);
		}
		return s.equals(rev);
		
	}

	public static void main(String[] args) {
		 String s = "level";
		 
		boolean res = ispalindrome(s);
		 
		 if (res ) {
	            System.out.println("\"" + s + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + s + "\" is not a palindrome.");


	}

}
}
