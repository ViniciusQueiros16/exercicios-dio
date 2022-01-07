package ARRAYS;

import java.util.Random;

public class Array_Multidimensional {
    public static void main(String[] args) {

        int[][] M = new int[4][4];
        Random random = new Random();
        for(int i = 0; i < M.length; i++) {
            for( int j = 0; j < M[i].length; j++) {

                M[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha : M  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }



    }
}
