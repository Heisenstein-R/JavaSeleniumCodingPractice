package Practice;

public class Two_ConstructorsWithDiffPara {


    Two_ConstructorsWithDiffPara(int a, float b) {
        System.out.println("a = " + a + " b = " + b);
    }

    Two_ConstructorsWithDiffPara(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String args[]) {
        byte a = 10;
        byte b = 15;
        Two_ConstructorsWithDiffPara test = new Two_ConstructorsWithDiffPara(a, b);
    }


}
