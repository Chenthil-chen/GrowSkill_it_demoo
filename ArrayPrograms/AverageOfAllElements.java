package ArrayPrograms;

public class AverageOfAllElements {
	
	    public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 15, 30};
	        int sum = 0;
	       
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i]; 
	        }

	        // Calculate the average
	        double average = (double) sum / arr.length;

	        
	        System.out.println("The average of all elements in the array is: " + average);
	    }
	}


