package ArrayPrograms;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
        int[] arr1 = {10, 5, 20};
        int[] arr2 = {15, 30, 25};
        
        // Merge the arrays
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        
        // Sort the merged array
        Arrays.sort(mergedArray);
        
        // Output the sorted merged array
        System.out.println("The merged and sorted array is: " + Arrays.toString(mergedArray));
    }

}
