package Amzon;

public class RevString {

	public static void main(String[] args) {
		
		String input = "hello jawan";
		
		//call the rev method
		
		String reve = reversstring (input);
		
		
		System.out.println(" Reverse string : "  +reve);
		
		
		
		
		

	}
	
	

	public static String reversstring(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		
		return sb.reverse().toString();
		
	}

}
