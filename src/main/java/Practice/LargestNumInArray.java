package Practice;

import java.util.Arrays;

public class LargestNumInArray {


    public static void main(String[] args) {

        LargestNumOfArray(new int[]{22, 44, 21});
        LargestNumOfArray(new int[]{992, 787, 63, 992});
        UsingStreams(new int[]{22, 44, 21});

    }

    public static void LargestNumOfArray(int[] nums) {

        Arrays.sort(nums);


        System.out.println("The largest number in the array at is: " +nums[nums.length -1]);


    }


    public static void UsingStreams(int[] nums){

        Arrays.stream(nums).max().getAsInt();

        System.out.println("The maximun value is: " +Arrays.stream(nums).max().getAsInt());

    }


}
