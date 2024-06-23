package Practice;

public class Ternary_Operator_3Nums {

    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        int c = 12;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("Max is : " +max);

    }

}
