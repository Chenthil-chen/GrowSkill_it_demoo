package Programs;

public class RemoveDuplicateChar {
	
	public static String removeduplicate(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		boolean[] seen  = new boolean[256];
		
		for(int i =0 ; i<s.length();i++) {
			char c = s.charAt(i);
			
		if(!seen[c]) {
			sb.append(c);
			seen [c] = true;
			
		}
		
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String s = "Chenthilkumaran";
		
		System.out.println(removeduplicate(s));
	

	}

}
