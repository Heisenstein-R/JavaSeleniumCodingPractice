package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCounts {


    public static void main(String[] args) {

        CountTheWords("hello i am hello there there is a bb a bb");

    }


    public static void CountTheWords(String inputString) {

        Map<String, Integer> wordsMap = new HashMap<>();

        String[] words = inputString.split(" ");

        for (String word : words) {

            if (wordsMap.containsKey(word)) {

                wordsMap.put(word.toLowerCase(), wordsMap.get(word) + 1);

            } else {
                wordsMap.put(word.toLowerCase(), 1);
            }

        }

        System.out.println(wordsMap);



        Set<String> stringSet = wordsMap.keySet();

        for (String word : stringSet) {

            if (wordsMap.get(word) > 1) {
                System.out.println(word + "  :  " + wordsMap.get(word));
            }

        }

    }


}
