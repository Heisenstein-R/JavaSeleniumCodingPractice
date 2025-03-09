package Practice;

import java.util.Arrays;

public class pivotArray {

    public static void main(String[] args) {


        int[] nums = {9,12,5,10,14,3,10};

        int[] arr = new int[nums.length];
        int j =0;
        for(int n : nums){
            if(n < 10){
               arr[j] =n;
                j++;
            }

        }
        for(int n : nums){
            if(n == 10){
                arr[j] =n;
                j++;
            }

        }

        for(int n : nums){
            if(n > 10){
                arr[j] =n;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
