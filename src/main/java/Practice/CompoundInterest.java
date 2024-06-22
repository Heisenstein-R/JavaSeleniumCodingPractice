package Practice;

public class CompoundInterest {
    public static void CI(double p, double t, double r) {

        //P(1 + R/100)^t

        System.out.println(
               "CI is " +( p * (Math.pow((1 + r / 100), t))  )
        );

    }

    public static void main(String[] args) {
        CI(10003.33, 9, 5);
    }
}
