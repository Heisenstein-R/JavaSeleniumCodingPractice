package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMap_To_ArrayList {
    public static void main(String[] args) {

        HashMap<String, Integer> nameMoneyHP = new HashMap<>();

        nameMoneyHP.put("Raj", 100);
        nameMoneyHP.put("Chitti", 2000);
        nameMoneyHP.put("Raji", 3000);
        nameMoneyHP.put("Monm", 8000);

        nameMoneyHP.forEach((K, v) -> System.out.println("Key is: " + K + "  The value is: " + v));
        System.out.println("-----------------------------");

        Iterator<String> it = nameMoneyHP.keySet().iterator();

        while (it.hasNext()) {

            String key = it.next();
            Integer value = nameMoneyHP.get(key);

            System.out.println("The key is: " + key + "  The Value is: " + value);
        }

        ArrayList<String> keylist = new ArrayList<>(nameMoneyHP.keySet());

        for (String e: keylist ){
            System.out.println(e);
        }

        List<Integer> valuelist = new ArrayList<>(nameMoneyHP.values());

        for (Integer e: valuelist){
            System.out.println(e);
        }



    }


}
