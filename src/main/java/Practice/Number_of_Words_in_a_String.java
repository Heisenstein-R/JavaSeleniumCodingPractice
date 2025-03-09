package Practice;

import java.util.ArrayList;

public class Number_of_Words_in_a_String {

    String string = "I am raj";


    public void countWords(){

        String[] words =  string.split(" ");

        for(String word: words){
            System.out.println(word);
        }

        System.out.println("Number of words in the array '"+string+"' are "+words.length);

    }

    public static void main(String[] args) {

        Number_of_Words_in_a_String obj = new Number_of_Words_in_a_String();
        obj.countWords();


    }


}
