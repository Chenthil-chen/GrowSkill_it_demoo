package ArrayPrograms;

public class SumOfElements {
	
	
	    public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 15, 30};
	        int sum = 0; 

	      
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i]; 
	        }

	        
	        System.out.println("The sum of all elements in the array is: " + sum);
	    }
	}


