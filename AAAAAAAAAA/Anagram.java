package AAAAAAAAAA;

import java.util.Arrays;

public class Anagram {
	
	public static boolean areanagarm(String s1,String s2) {
		char[] s1array = s1.toCharArray();
		char[] s2array = s2.toCharArray();
		
		Arrays.sort(s1array);
		Arrays.sort(s2array);
		
		return Arrays.equals(s1array, s2array);
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "tcs";
		String s2  = "sct";
		
		System.out.println(areanagarm(s1,s2));

	}

}
