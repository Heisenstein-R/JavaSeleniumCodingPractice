package Practice;

public class FibonacciSeries {


    public  static void  seriesofFibon(int n){

        int first = 0;
        int second = 1;
        int sum = 0;
        System.out.println(first);
        System.out.println(second);

        for ( int i = 2; i<n; i++){

            sum = first+second;
            System.out.println(sum);
            first = second;
            second=sum;
        }

    }

    public static void main(String[] args) {
        seriesofFibon(16);
    }
}
