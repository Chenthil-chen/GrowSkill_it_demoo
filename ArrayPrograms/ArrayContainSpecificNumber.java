package ArrayPrograms;

public class ArrayContainSpecificNumber {

	    public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 15, 30};
	        int target = 20;  

	        boolean found = false;  

	     
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                found = true;  
	                break;  
	            }
	        }

	        // Output whether the number is found
	        if (found) {
	            System.out.println("The array contains the number " + target);
	        } else {
	            System.out.println("The array does not contain the number " + target);
	        }
	    }
	}

