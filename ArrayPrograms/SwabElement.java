package ArrayPrograms;

public class SwabElement {
	public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 30};  // Example array

        // Swap the first and last elements
        int temp = arr[0];                // Store the first element in a temporary variable
        arr[0] = arr[arr.length - 1];     // Assign the last element to the first position
        arr[arr.length - 1] = temp;       // Assign the stored first element to the last position

        // Output the modified array
        System.out.println("Array after swapping the first and last elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
