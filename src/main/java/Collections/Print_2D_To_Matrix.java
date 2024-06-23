package Collections;

public class Print_2D_To_Matrix {
    public static void main(String[] args) {

        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};


        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < (arr1[0].length); j++) {

                System.out.print(arr1[i][j] + " ");

            }
            System.out.println();

        }


    }


}
