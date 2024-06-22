package Practice;


import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String: ");

        String OriginalString = scanner.nextLine();

        System.out.println("You entered: " + OriginalString);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = OriginalString.length() - 1; i >= 0; i--) {

            stringBuilder.append(OriginalString.charAt(i));

        }

        String reversedString = stringBuilder.toString();
        System.out.println("The reversed String is: " + reversedString);

        if(OriginalString.equalsIgnoreCase(reversedString)){
            System.out.println("Entered String '"+OriginalString+"' is a Palindrome.");
        } else {
            System.out.println("Entered String '"+OriginalString+"' is not a Palindrome.");
        }

    }


}
