package Practice;

import javax.sound.midi.MidiChannel;
import java.util.Arrays;

public class Binary_Search {

    public static int searchBinary(int[] arr, int x) {


        int high = arr.length - 1;
        int low = 0;


        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 11, 5, 55, 77};
        Arrays.sort(arr);
        int x = 5;

        int index = searchBinary(arr, x);

        if (!(index == -1)) {
            System.out.println(x + " is at position index of " + index);
        } else {
            System.out.println("Enter the Num within the Array");
        }

    }
}
