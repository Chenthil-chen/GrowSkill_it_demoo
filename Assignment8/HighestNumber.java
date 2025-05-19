package Assignment8;

public class HighestNumber {
	

	 public static void main(String[] args) {
	        int[] arr = {3, 9, 1, 7, 5};
	        int highest = findHighestNumber(arr);
	        System.out.println("The highest number is: " + highest);
	    }

	    public static int findHighestNumber(int[] arr) {
	        // Assume the first element is the highest
	        int highest = arr[0];

	        // Iterate through the array
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > highest) {
	                highest = arr[i];
	            }
	        }

	        return highest;
	    }
	}