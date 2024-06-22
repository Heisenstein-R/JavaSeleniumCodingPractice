package Practice;

import org.apache.commons.math3.stat.descriptive.summary.Sum;

import java.util.ArrayList;

public class Finding_A_Missing_Num {
    public static void main(String[] args) {

        //missing an num in the series
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};

        int l = arr.length;
        int n = l + 1;
//        System.out.println(l);

        //n(n+1)/2  is the series summation formula

        int series = (9 * (9 + 1)) / 2;
        int Sum = 0;
        for (int i: arr){
            Sum = Sum +i;
        }

        System.out.println("missing num "+(series - Sum));

    }


}
