package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CombineArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // Create a new array with the size of both arrays combined
        int[] mergedArr = new int[arr1.length + arr2.length];

        // Copy the first array into the merged array
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);

        // Copy the second array into the merged array
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        Arrays.sort(mergedArr);
        return mergedArr;



    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArr = mergeArrays(arr1, arr2);

        System.out.println(Arrays.toString(mergedArr)); // Output: [1, 3, 5, 7, 2, 4, 6, 8]
    }

}
