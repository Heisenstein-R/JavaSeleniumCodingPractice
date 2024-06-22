package Practice;

public class ABC_Pyramid {
    public static void main(String[] args) {

//        A-Z : 65-90
//        a-z : 97-122


        int alpha = 65;
//        System.out.println((char)65);

        int rows = 8;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) alpha);
            }
            System.out.println();
            alpha++;
        }

    }


}
