package ArrayPrograms;

public class FirstAndLastOccurences {
	 public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 15, 20, 30, 20};
	        int target = 20;  // Element to find first and last occurrence of

	        int firstIndex = -1;  // Initialize as -1 (indicating not found)
	        int lastIndex = -1;

	        // Loop through the array to find first and last occurrence of target
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                if (firstIndex == -1) {
	                    firstIndex = i;  // Set firstIndex when the target is first found
	                }
	                lastIndex = i;  // Keep updating lastIndex to the latest position
	            }
	        }

	        // Output the results
	        if (firstIndex != -1) {
	            System.out.println("The first occurrence of " + target + " is at index: " + firstIndex);
	            System.out.println("The last occurrence of " + target + " is at index: " + lastIndex);
	        } else {
	            System.out.println("The element " + target + " is not found in the array.");
	        }
	    }
	

}
