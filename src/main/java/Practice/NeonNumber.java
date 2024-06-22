package Practice;

public class NeonNumber {

    public static void NeonNum(int num) {

        int r = 0;
        int sum = 0;
        int temp = num;

        num = num * num;
        while (num > 0) {
            r = num % 10;
            num = num/10;
            sum = sum + r;
        }

        if(temp == sum){
            System.out.println("Given Number is a neon num");
        }else {
            System.out.println("Not a neon number");
        }
    }

    public static void main(String[] args) {
        NeonNum(1);
    }

}
