package Amzon;

import java.util.Arrays;

public class SecMax {
	
public static int secondmax(int[] arr) {
		
		if(arr == null || arr.length < 2) {
			
			throw new IllegalArgumentException("Array must contain atleast two elements ");
		}
		
		Arrays.sort(arr);
		
		for(int i = arr.length - 2;i>=0;i--) {
			if(arr[i] < arr[arr.length-1]) {
				
				return arr[i];
			}
			
		}
		throw new IllegalArgumentException("No sec minimum found ");
			
	
		}

public static void main(String[] args) {
	int[] arr = {1,6,4,5,4,7};
	
	System.out.println( " Second max  : " +secondmax(arr));
	
}
		

}
