package Arrays;

import java.util.Arrays;

public class k_largest_elements {

    public static void main(String[] args) {

        int arr[] = {12, 5, 787, 1, 23};


        Arrays.sort(arr);

        int k = 3;

        System.out.println("kth largest is: "+arr[arr.length-3]);


        for(int i = arr.length -1; i >= arr.length -k; i--){

            System.out.println(arr[i]);

        }





    }



}
