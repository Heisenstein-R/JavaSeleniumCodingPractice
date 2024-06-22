package Practice;

import org.apache.poi.ss.formula.functions.Rows;

public class StarsPrinting {

    public static void LeftStars(int rows) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void RightStars(int rows) {

        for (int i = 0; i < rows; i++) {
            int k = 2 * (rows - i) - 1;
            while (k > 1) {
                k--;
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }

    }


    public static void StarsInMiddle(int rows) {

        for (int i = 0; i < rows; i++) {
            int k = (rows - i);
            while (k > 1) {
                k--;
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }

    }


    public static void PyramidWithNums(int rows) {
        for (int i = 0; i < rows; i++) {
            int k = (rows - i);
            while (k > 1) {
                k--;
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(" " + j);

            }
            System.out.println();
        }
    }


    public static void PyramidWithNums1(int rows) {

        int rowcount = 1;

        for (int i = rows; i>0; i--) {

            for (int j = 1; j <= i*2; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= rowcount; j++) {

                System.out.print(j + " ");

            }

            for (int j = rowcount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
            rowcount++;

        }

    }


    public static void main(String[] args) {
//        LeftStars(5);
//        RightStars(5);
//        StarsInMiddle(5);

//        PyramidWithNums(6);
        PyramidWithNums1(5);
    }
}
