package Amzon;

public class RemovalDuplicates {
	
	public static String removdup(String s) {
		StringBuilder sb = new StringBuilder(s.length());
		boolean[] seen = new boolean[256];
		
		for(int i = 0; i<s.length();i++) {
			char c = s.charAt(i);
			
			if(! seen[c]) {
				sb.append(c);
				seen[c] = true;
				
				
			}
		}
		
		return sb.toString();
		
	}
	

	public static void main(String[] args) {
		
		String s1 = "chenthillk";
		System.out.println((removdup(s1)));

	}

}
