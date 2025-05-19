package Amzon;

import java.util.Arrays;

public class SecMinimum {
	
	public static int secondmin(int[] arr) {
		
		if(arr == null || arr.length < 2) {
			
			throw new IllegalArgumentException("Array must contain atleast two elements ");
		}
		
		Arrays.sort(arr);
		
		for(int i =1 ; i < arr.length; i++) {
			if(arr[i]> arr[0]) {
				
				return arr[i];
			}
		}
			
			throw new IllegalArgumentException("No sec element found ");
			
		}
	
		
	
	
	public static void main(String[] args) {
		
		int [] arr = {1,3,5,7};
		
		System.out.println("Second min number : " +secondmin(arr));
		
		
	}
}
		
		
	