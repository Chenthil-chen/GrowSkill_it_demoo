package ArrayPrograms;

import java.util.Arrays;

public class TwoArrayEqual {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 20, 15};
        int[] arr2 = {20, 5, 10, 15};
        
        // Check if the two arrays are equal
        boolean isEqual = Arrays.equals(arr1, arr2);

        if (isEqual) {
            System.out.println("The two arrays are equal.");
        }
         else {
            System.out.println("The two arrays are not equal.");
        }
    }
}
