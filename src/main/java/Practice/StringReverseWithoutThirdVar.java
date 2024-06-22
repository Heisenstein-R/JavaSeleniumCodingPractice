package Practice;

public class StringReverseWithoutThirdVar {


    public static void main(String[] args) {

        swap(10, 11);
        swap(98, 66);

    }

    public static void swap(int a, int b) {

        System.out.println("a = " + a + " and b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped values are: a = " + a + " and b = " + b);

    }


}
