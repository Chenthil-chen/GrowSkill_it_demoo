package ArrayPrograms;

public class SpecificNumber {
	public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 20, 30, 20};
        int target = 20;  // Number to count occurrences of

        int count = 0;  // Initialize count to 0

      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;  
            }

            }
        System.out.println("The number " + target + " appears " + count + " times in the array.");
    }
	}

