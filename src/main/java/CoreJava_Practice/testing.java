package CoreJava_Practice;

import java.util.HashMap;
import java.util.Map;

public class testing {

    public static void main(String[] args) {


        String s = "Google";

        String[] arr = s.split("");

        for(String l : arr){
            System.out.print(l);
        }

        Map<String, Integer> map = new HashMap<>();

        for (String l : arr){
            if(map.containsKey(l)){
                map.put(l, map.get(l)+1);
            }else{
                map.put(l, 1);
            }
        }

        System.out.println(map);


        char[] carr = s.toCharArray();

        Map<Character, Integer> map1 = new HashMap<>();


        for (char c: carr){
            if(map1.containsKey(c)){
                map1.put(c, map1.get(c)+1);
            }else {
                map1.put(c, 1);
            }
        }
        System.out.println(map1);

    }
}
