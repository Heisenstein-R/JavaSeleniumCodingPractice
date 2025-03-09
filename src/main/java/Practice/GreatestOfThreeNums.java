package Practice;

public class GreatestOfThreeNums {

    public static int Greaternum(int x, int y, int z) {

        if (x > y) {
            if (x > z) {
                System.out.println("X is greater");
            } else {
                System.out.println("Z is greater");
            }
        } else if (y > z) {
            System.out.println("Y is greater");
        } else {
            System.out.println("Z is greater");
        }

        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);

    }





    public static void main(String[] args) {

        int largestnum = GreatestOfThreeNums.Greaternum(88, 909, 11);

        System.out.println("Largest num is: " + largestnum);


    }


}
