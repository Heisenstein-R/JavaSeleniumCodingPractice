package Practice;

public class Leapyear {

    public static void leapYearcal(int year){

//        if(year%4 == 0){
//            if (year%400 == 0){
//                if (year%100 == 0){
//                    System.out.println(year+ " is a Not Leap year");
//                }else {
//                    System.out.println(year+" is a Leap year");
//                }
//            }else {
//                System.out.println(year+" is not a Leap year");
//            }
//
//        }else {
//            System.out.println(year+" is not a Leap year");
//        }

        if(year%4 == 0 || year%400 == 0 ){

            if (year%100 == 0){
                System.out.println("Not a Leap year");
            }else {
                System.out.println("Leap year");
            }

        }else {
            System.out.println("not a Leap year");
        }




    }

    public static void main(String[] args) {
        Leapyear.leapYearcal(2904);
    }

}
