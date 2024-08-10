package Arrays;

public class Maximum_Sub_Array {
    public static void main(String[] args) {

        int a[] = {1, 2, 5, -7, 2, 3, 4,7};

        int Negative_Position = 0;

        //finding the index of -ve integer

        for(int i =0 ; i < a.length; i++){
            if(a[i] < 0){
                Negative_Position = i;
//                System.out.println("Position is: "+Negative_Position);
            }
        }

        int subA[] = {};
        int subB[] = {};



        //sum of first substring
        int Sum_Sub_String_A = 0;
        for(int i =0 ; i < Negative_Position ; i ++){

            Sum_Sub_String_A = Sum_Sub_String_A + a[i];
        }


        //sum of second substring
        int Sum_Sub_String_B = 0;
        for(int i = Negative_Position+1;  i< a.length-1 ; i ++){
            Sum_Sub_String_A = Sum_Sub_String_B + a[i];
        }


        if(Sum_Sub_String_A > Sum_Sub_String_B){
            for(int i = 0; i< Negative_Position ; i ++){
                System.out.println(a[i]);
            }
        }else {
            for(int i = Negative_Position+1;  i< a.length-1 ; i ++){
                System.out.println(a[i]);
            }
        }




    }


}
