package Arrays;

import java.util.*;

public class Missing_and_Repeating {


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 5};

        Arrays.sort(arr);


        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {

                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);
            }

        }



        Set<Integer> keyset = map.keySet();

        for (Integer i : keyset){
            if(map.get(i) > 1){
                System.out.println("Repeating number is " +i);
            }
        }



        int Current_Sum = 0;
        int n = arr.length;

        for (Integer i : keyset) {
            Current_Sum = Current_Sum + i;
        }

//        System.out.println("Sum of all the elements in an array: " + Current_Sum);

        int Expected_Summation = n * (n + 1) / 2;
        int missing_num = Expected_Summation - Current_Sum;

        System.out.println("Missing element in an array is: " + missing_num);

    }


}
