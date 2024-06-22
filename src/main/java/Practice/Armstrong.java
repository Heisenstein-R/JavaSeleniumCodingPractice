package Practice;

public class Armstrong {


    public static void isArmstrong(int num) {

        System.out.println("Given number is: "+num);

        int r;
        int t;
        int cube = 0;
        t = num;

        while (num > 0) {

            r = num % 10;
            num = num / 10;

            cube = cube + (r * r * r);

        }


        if (t == cube) {
            System.out.println("Given Number is an Armstrong");
        } else {
            System.out.println("Given Number is not an Armstrong");
        }


    }


    public static void main(String[] args) {
        isArmstrong(407);
        isArmstrong(153);
        isArmstrong(370);
        isArmstrong(0);
        isArmstrong(33);
    }


}
