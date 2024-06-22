package Practice;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];



        int length = arr1.length;

        int start = 0;
        int end = length - 1;

        while (end >= 0) {

            arr2[start] = arr1[end];
            start++;
            end--;

        }

        for (int i = 0; i < length; i++) {
            System.out.println(arr2[i]);
        }


    }


}
