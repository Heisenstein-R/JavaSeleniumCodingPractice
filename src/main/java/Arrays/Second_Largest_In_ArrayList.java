package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Second_Largest_In_ArrayList {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();


        list.add(3);
        list.add(8);
        list.add(9);
        list.add(5);
        list.add(2);
        list.add(12);

        for(int i =0; i < list.size(); i++){
            for (int j = i; j<list.size(); j++){

                if (list.get(i)>list.get(j)){
                    Collections.swap(list, i, j);
                }

            }

            System.out.println(list.get(i));


        }

        System.out.println("Second largest is: "+list.get(list.size()-2));

    }


}
