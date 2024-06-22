package Practice;

public class Factorial {

    public static void factorialOf(int num) {
        System.out.println("Entered number is:" + num);

        int i = 0;
        int prod = 0;
        prod = num;

        while (num > 0) {
            num = num - 1;
            prod = prod * num;

            if (num == 1) {
                break;
            }

        }
        System.out.println(prod);
    }


    public static int usingRecursive(int n) {

        if (n == 0) {
            return 1;
        }

        return n * usingRecursive(n - 1);

    }


    public static void main(String[] args) {
        factorialOf(5);
        System.out.println(usingRecursive(0));
    }


}
