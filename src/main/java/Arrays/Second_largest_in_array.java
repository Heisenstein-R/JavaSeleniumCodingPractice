package Arrays;

import netscape.javascript.JSException;
import org.apache.poi.ss.formula.functions.Count;

import java.util.jar.JarEntry;

public class Second_largest_in_array {

    public static void main(String[] args) {

        int a[] = {5, 2, 8, 9, 0, 2, 4};


        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {
                int temp = 0;
                if (a[i] > a[j]) {

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }

            }
            System.out.println(a[i]);
        }

        System.out.println("The second largest num is: "+a[a.length-2]);

    }

}
