package Practice;

import java.util.Arrays;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        int n = 19;


        int count = 0;


        for (int i = 2; i <= n - 1; i++) {

            int remainder = n % i;

            if (remainder == 0) {
                count += 1;
            }

        }

        System.out.println(count);

        if (count > 0) {
            System.out.println("Not Prime number");
        } else {
            System.out.println(" it is a prime Number");
        }


    }


}
