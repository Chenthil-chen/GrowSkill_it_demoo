package ArrayPrograms;

public class MoveAllZerosToEnd {
	 public static void main(String[] args) {
	        int[] arr = {0, 1, 9, 0, 5, 0, 3};

	        // Move all zeros to the end while maintaining order
	        int nonZeroIndex = 0;

	        // Traverse the array and move non-zero elements to the front
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                arr[nonZeroIndex] = arr[i];  // Move non-zero element to the front
	                nonZeroIndex++;
	            }
	        }

	        // Fill the remaining positions with zeros
	        while (nonZeroIndex < arr.length) {
	            arr[nonZeroIndex] = 0;
	            nonZeroIndex++;
	        }

	        // Output the modified array
	        System.out.println("Array after moving zeros to the end: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


