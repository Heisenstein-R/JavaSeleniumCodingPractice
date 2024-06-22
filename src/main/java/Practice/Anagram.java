package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first String: ");

        String anagram1 = scanner.nextLine();

        System.out.println("Enter the second String: ");

        String anagram2 = scanner.nextLine();



        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < anagram1.length(); i++) {
            if (map.containsKey(anagram1.charAt(i))) {

                map.put(anagram1.charAt(i), map.get(anagram1.charAt(i)) + 1);
            } else {

                map.put(anagram1.charAt(i), 1);

            }


        }

        System.out.println(map);


    }


}
