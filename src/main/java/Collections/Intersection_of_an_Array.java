package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Intersection_of_an_Array {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] array3 = {5, 7, 8, 9, 10};


        Map<Integer, Integer> map = new HashMap<>();


        for (int num : array1){
            map.put(num, 1);
        }

        for(int  num: array2){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num, 1);
            }
        }

        for (int num : array3){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }

        Set<Integer> set = map.keySet();


        for(int n : set){
            if(map.get(n) == 3){
                System.out.println("The common number is: " +map.get(n));
            }

        }

    }


}
