package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_Chars_In_a_String {

    public static void main(String[] args) {

        String s = "malayaalam";

       char[] chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char c: chars){

            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }

        Set<Character> set = map.keySet();

        for(char c: set){
            if (map.get(c) > 1){
                System.out.println("The characters are: "+ c + "  and repeating: "+ map.get(c) + " times.");
            }

        }









    }





}
