package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicates_In_AnArray {

    public static void main(String[] args) {


        String[] array = {"raju", "Raji", "mom", "dad", "raghu", "dad", "Raji", "Raji"};

        Map<String, Integer> map = new HashMap<>();

        for (String w : array) {
            Integer count = map.get(w);

            if (count == null) {
                map.put(w, 1);
            } else {
                map.put(w, ++count);
            }

        }

        System.out.println(map);

        Set<String> set = map.keySet();

        for (String e : set) {
            if (map.get(e) > 1) {
                System.out.println(e);
            }
        }


    }


}
