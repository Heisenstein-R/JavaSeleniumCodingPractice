package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first String: ");
        String anagram1 = scanner.nextLine();

        System.out.println("Enter the second String: ");
        String anagram2 = scanner.nextLine();

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();


        for (int i = 0; i < anagram1.length(); i++) {

            if (map1.containsKey(anagram1.charAt(i))) {

                map1.put(anagram1.charAt(i), map1.get(anagram1.charAt(i)) + 1);

            } else {
                map1.put(anagram1.charAt(i), 1);
            }
        }
        System.out.println(map1);


        for (int i = 0; i < anagram2.length(); i++) {

            if (map2.containsKey(anagram2.charAt(i))) {

                map2.put(anagram2.charAt(i), map2.get(anagram2.charAt(i)) + 1);

            } else {
                map2.put(anagram2.charAt(i), 1);
            }

        }

        System.out.println(map2);


        if (map1.equals(map2)) {
            System.out.println("Given string are anagram: ");
        } else {
            System.out.println("Given Strings are not anagram: ");
        }


    }


}
