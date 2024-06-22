package Practice;

public class LinearSearch {

    public static int searchForEle(int[] arr, int x, int l) {

        for (int i = 0; i < l; i++) {
            if (arr[i] == x) {
                return i;
            }

        }

        return -1;
    }


    public static void main(String[] args) {

        int arr[] = {2, 5, 3, 9, 5};
        int x = 9;
        int l = arr.length;
        int position = searchForEle(arr, x, l);

        if (!(position == -1)) {
            System.out.println(x + " found at position " + position);
        } else {
            System.out.println("Enter the correct position");
        }


    }

}
