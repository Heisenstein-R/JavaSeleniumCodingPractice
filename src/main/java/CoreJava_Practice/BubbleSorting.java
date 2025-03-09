package CoreJava_Practice;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {

        int[] a = {21, 44, 66, 23, 67, 73, 87, 94, 114, 8};

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i-1; j++) {

                if (a[j] > a[j +1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

    }


}
