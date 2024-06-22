package Practice;

public class VovelOrConsonant {


    public static void checkVowelOrConsonant(char c){

        //Regular Logic
        if('A'==c||'E'==c||'I'==c||'O'==c||'U'==c||'a'==c||'e'==c||'i'==c||'o'==c||'u'==c){
            System.out.println(c + " is a Vowel");
        } else {
            System.out.println(c+" is a consonant");
        }

        //Using String
        String vowels = "aeiouAEIOU";

        String result = vowels.indexOf(c) > -1 ? "Vowel" : "Consonat";

        System.out.println(result);


    }


    public static void main(String[] args) {
        checkVowelOrConsonant('E');
    }


}
