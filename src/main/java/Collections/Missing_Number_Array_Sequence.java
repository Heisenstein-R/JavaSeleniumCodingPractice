package Collections;

public class Missing_Number_Array_Sequence {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,7};

        int n = arr.length + 1;

        int sum = 0;

        for (int i : arr){
            sum = sum+i;
        }

        int series = n*(n + 1)/2;

        System.out.println("The missing number in the array is: " +(series - sum));

    }



}
