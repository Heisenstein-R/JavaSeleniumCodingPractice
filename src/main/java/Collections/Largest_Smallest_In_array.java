package Collections;

import java.util.Arrays;

public class Largest_Smallest_In_array {
    public static void main(String[] args) {

        int[] arr = {3,6,8,2,1,0,3,6};
//        int[] large = new int[arr.length];

        large(arr);

        Arrays.sort(arr);

        System.out.println("The 3rd greatest is: "+arr[(arr.length)-3]);

        for(int i: arr){
            System.out.println(i);
        }


    }


    public static void large(int[] arr){

        int large = arr[0];
        int count = 0;

        for(int i = 0; i< arr.length; i ++){

            if(arr[i] > large){
                large = arr[i];
            }
        }

        System.out.println("The greatest number in the array is: " +large );

    }



}
