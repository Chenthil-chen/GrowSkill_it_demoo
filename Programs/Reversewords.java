package Programs;

import java.util.regex.Pattern;

public class Reversewords {
	
	public static String reverseword(String str) {
		
		Pattern pattern = Pattern.compile("\\s");
		
		String[] temp = pattern.split(str);
		
		String result = "" ;
		
		for (int i = 0;i < temp.length; i++) {
			if(i == temp.length-1) 
				result = temp[i] + result;
				else 
					result = " " + temp[i]+ result;
			}
			
				return result;
		}
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "i love java";
		
		System.out.println(reverseword(s1));

	}

}
