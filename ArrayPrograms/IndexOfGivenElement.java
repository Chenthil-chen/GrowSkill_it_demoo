package ArrayPrograms;

public class IndexOfGivenElement {
	public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 30};
        int target = 20;  // Element to search for

       
        int index = -1;  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;  
                break;  
            }
        }

        // Output the index of the element (or indicate it was not found)
        if (index != -1) {
            System.out.println("The element " + target + " is found at index: " + index);
        } else {
            System.out.println("The element " + target + " is not found in the array.");
        }
    }


}
