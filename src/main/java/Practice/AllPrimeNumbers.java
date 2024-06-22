package Practice;

import org.apache.poi.ss.formula.functions.Count;

public class AllPrimeNumbers {

    public static void PrintPrimeNums(int N) {

        int count = 0;
        if (N == 0 || N == 1) {
            System.out.println("Entered Num is below 2");
        }

        while (N >= 2) {
            int flag = 0;
            for (int i = 2; i <= N /2; i++) {
                if (N % i == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println(N);
                count ++;
            }
            N--;
        }

        System.out.println("Total Number of Prime numbers are: "+count);

    }

    public static void main(String[] args) {
        AllPrimeNumbers.PrintPrimeNums(313);
    }

}
