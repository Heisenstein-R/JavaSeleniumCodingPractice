package Practice;

import java.util.ArrayList;
import java.util.List;

public class RomanNumbers {
    public static int romanToInt(String s) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        List<Integer> list = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(c == 'I'){
                list.add(I);
            }else if(c == 'V'){
                list.add(V);
            }else if(c == 'X'){
                list.add(X);
            }else if(c =='L'){
                list.add(L);
            }else if(c == 'C'){
                list.add(C);
            }else if(c == 'D'){
                list.add(D);
            }else if(c == 'M'){
                list.add(M);
            }
        }

        System.out.println(list);

        int sum = 0;

        for(int i = 0; i < list.size(); i++){
            if(i+1 < list.size() && list.get(i) < list.get(i+1)){
                sum = sum - list.get(i);
            }else{
                sum = sum + list.get(i);
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        // Test the function
        System.out.println(RomanNumbers.romanToInt("MCMXCIV"));
    }
}
