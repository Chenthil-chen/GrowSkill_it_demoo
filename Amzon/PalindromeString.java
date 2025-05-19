package Amzon;

public class PalindromeString {
	
	public static boolean ispalindrome (String s)
	{
		s = s.toLowerCase();
		String rev = "" ;
		for (int i = s.length()-1; i>=0;i--) {
			rev = rev +s.charAt(i);
		}
	return s.equals(rev);
	}

	public static void main(String[] args) {
	
		String s = "madae";
		
		boolean rev = ispalindrome(s);
		
		if(rev) {
			System.out.println("\" " +s+  "\"  is an palindrome");
		}
		else {
			System.out.println("\" " +s+  "\"  is an not palindrome");
		}

	}

}
