package ArrayPrograms;

public class MiminumNumber {
	
	
	    public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 15, 30};
	        int min = arr[0]; 
	        
	        
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i]; 
	            }
	        }

	        System.out.println("The minimum number in the array is: " + min);
	    }

}
	
