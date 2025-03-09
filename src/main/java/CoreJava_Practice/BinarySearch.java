package CoreJava_Practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {45, 88,23,78,90,1,6,9,3,8,34};

        for (int i = 0; i < a.length; i ++){
           for (int j =0; j < a.length-i-1; j++){
              if (a[j] > a[j+1]){
                  int temp = a[j];
                  a[j] = a[j+1];
                  a[j+1] = temp;
              }
           }
        }


        for (int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }


        int target = 45;
        int left = 0;
        int right = a.length-1;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(a[mid] == target){
                System.out.println("target found at: " +mid);
            }
            if(a[mid] > target){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }

//        System.out.println("Element not found");


    }
}
