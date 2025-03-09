package Practice;

import java.util.*;

public class commonPrefixStrings {

    public static String longestCommonPrefix(String[] strs) {

        Map<Character, Integer> map = new HashMap<>();

        for(String s : strs){
            for(int i =0 ; i < s.length() ; i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                }else{
                    map.put(s.charAt(i), 1);
                }
            }
        }

        System.out.println(map);

        Set<Character> set = map.keySet();  // Corrected to use keySet() method

        StringBuilder sb = new StringBuilder();

        // Enhanced for loop to iterate over the set
        for (Character c : set) {  // Use Character instead of char
            // Check if the map value corresponding to 'c' matches the length of strs
            if (map.get(c) == strs.length) {
                sb.append(c);  // Append the character to StringBuilder (no need for Character.toString())
            }
        }

        Map<Character, Integer> lhm = new LinkedHashMap<>();
        for(String s : strs){
            for(int i =0 ; i < s.length() ; i++){
                if(lhm.containsKey(s.charAt(i))){
                    lhm.put(s.charAt(i), lhm.get(s.charAt(i))+1);
                }else{
                    lhm.put(s.charAt(i), 1);
                }
            }
        }

        System.out.println(lhm);

        return sb.toString();



    }

    public static void main(String[] args) {
        System.out.println(commonPrefixStrings.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
