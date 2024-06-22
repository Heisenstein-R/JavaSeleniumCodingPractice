package Collections;

import org.checkerframework.checker.units.qual.K;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapAndMap {
    public static void main(String[] args) {

        HashMap<String, String> nameAddr = new HashMap<>();

        nameAddr.put("Raj", "Hyd");
        nameAddr.put("Chitti", "KP");
        nameAddr.put("Raji", "indra");
        nameAddr.put("Monm", "KPHB");

        Iterator<String> it = nameAddr.keySet().iterator();

        while (it.hasNext()) {

            String key = it.next();
            String value = nameAddr.get(key);

            System.out.println("The key is: " + key + " and Value is: " + value);

        }

        Iterator<Entry<String, String>> it1 = nameAddr.entrySet().iterator();

        while (it1.hasNext()) {

            Entry<String, String> entry = it1.next();

            System.out.println("The Key is: " + entry.getKey() + " The Value is: " + entry.getValue());

        }

        System.out.println("____________________________");
        nameAddr.forEach((k, v) -> System.out.println("The key is: "+k+"  The Value is "+v));

    }


}
