package Practice;

public class ConstructorWithFail {

    int a;
    int b;


    ConstructorWithFail(int c, int d) {

        a = c;
        b = d;
    }

    public static void main(String[] args) {
        ConstructorWithFail test = new ConstructorWithFail(10, 20);

        System.out.println("a = " + test.a + "  b = " +test.b);

    }



}
