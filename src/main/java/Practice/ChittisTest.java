package Practice;

public class ChittisTest {



    public static void EvenOrOdd(int i){

        System.out.println(i&1);

        if((i & 1) == 1){
            System.out.println(i +" is odd Number");
        }else{
            System.out.println(i+ " is Even Number");
        }

    }


    public static void main(String[] args) {

        ChittisTest.EvenOrOdd(23);

    }


}
