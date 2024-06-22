package Collections;

import java.util.ArrayList;

public class Sorting_An_Array {

    public static void main(String[] args) {

        int arr1[] = {-1,22,11,-4,-12,19,7,0,19,22,-22,-11};


 int[] arr2 = new int[arr1.length];

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();




//-1, -4, -12, -22, -11, 22, 11, 19, 7, 0 19, 22

        System.out.println();


        for(int i =0; i< arr1.length; i ++){

            if(arr1[i] < 0){
                list1.add(arr1[i]);
            }else{
                list2.add(arr1[i]);
            }

        }

        for(int i =0; i < list1.size(); i++ ){
            System.out.println(list1.get(i));
        }
        for(int i =0; i < list2.size(); i++ ){
            System.out.println(list2.get(i));
        }

    }


}
