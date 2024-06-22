package Practice;

import java.util.HashMap;
import java.util.Map;

public class First_Occurence_of_unique_char {


    public static void main(String[] args) {

        String string = "swiss";

        FirstOccurenceOfUnique(string);
        FirstOccurenceOfUnique("jkakjd iadioiow jasnslas");

    }

    public static void FirstOccurenceOfUnique(String s) {


        Map<Character, Integer> mapForString = new HashMap<>();

        char[] charOfArray = s.toCharArray();

        System.out.println(charOfArray);

        for (char arraytofindchar : charOfArray) {
            System.out.println(arraytofindchar);
        }

        for (int i = 0; i < s.length(); i++) {

            if (mapForString.containsKey(s.charAt(i))) {
                mapForString.put(s.charAt(i), mapForString.get(s.charAt(i)) + 1);
            } else {
                mapForString.put(s.charAt(i), 1);
            }

        }

        System.out.println("The Map is: " + mapForString);

        for (char c : charOfArray) {

            if (mapForString.get(c) == 1) {
                System.out.println("The first Unique character is: " + c);
                break;
            }

        }


    }


}
