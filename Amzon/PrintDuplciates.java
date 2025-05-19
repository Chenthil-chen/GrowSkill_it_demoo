package Amzon;

import java.util.Arrays;

public class PrintDuplciates {
	
	public static void printduplcuatesvalues(String str) {
		
		int len = str.length();
		char [] chars = str.toCharArray();
		Arrays.sort(chars);
		
		String sortedstr = new String (chars);
		
		
		for(int i=0;i<len;i++) {
			int count = 1;
			
			while(i<len - 1 && sortedstr.charAt(i)== sortedstr.charAt(i+1)) {
				count++;
				i++;
			}
			
			if(count>1) {
				System.out.println(sortedstr.charAt(i) + "count = "+count);
			}
		}
	}

	public static void main(String[] args) {
		String str = "test test";
		printduplcuatesvalues(str);
		
		

	}

}
