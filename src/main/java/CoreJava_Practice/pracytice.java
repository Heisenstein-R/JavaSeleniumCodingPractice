package CoreJava_Practice;

import javax.xml.transform.Source;

public class pracytice {
    public static void main(String[] args) {

        Integer[] ar = {78, 34, 23, 67, 44, 13};



        for (int i =0; i< ar.length ; i++){
            for (int j =0; j < ar.length-i-1 ; j ++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }


        int low = 0;
        int high = ar.length-1;


        int target = 67;


        while(low <= high){

            int mid = low + (high-low)/2;

            if (ar[mid] > target){
                high = mid-1;
            }else if (ar[mid] < target){
                low = mid+1;
            } else if (ar[mid] == target) {
                System.out.println("The target value: "+target+" found at: " + (mid+1) + "th place");
                break;
            }else {
                System.out.println("Enter the correct number");
                break;
            }


        }





//        for(int i : ar){
//            System.out.println(i);
//        }


    }
}
