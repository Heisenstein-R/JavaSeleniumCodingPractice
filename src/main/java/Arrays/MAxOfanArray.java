package Arrays;

import java.util.*;

public class MAxOfanArray {



    public static void main(String[] args) {
        Integer[] arr = {20, 10, 20, 4, 100};

        int[] arr1 = {1, 2, 2, 3, 4, 4, 4, 5, 5};

//        int max = Arrays.stream(arr).max().getAsInt();

//        System.out.println(max);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(Collections.max(list));

        Set<Integer> set = new LinkedHashSet<>();

        for (int n : arr1){
            set.add(n);
        }

        System.out.println(Arrays.toString(set.toArray()));


    }
}
