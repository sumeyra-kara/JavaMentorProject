package day24_Arrays_3_Multi;

import java.util.Arrays;

public class C03_MultiDimArrays {
    public static void main(String[] args) {
        Object [][][] arr ={{{2}, {3}},{{"1"}, {"5"}},{{6}, {7}}};

        int [][] multiDim = new int[3][2];
        multiDim[0][0] = 1;
        multiDim[0][1] = 1;
        multiDim[1][0] = 1;
        multiDim[1][1] = 1;
        multiDim[2][0] = 1;
        multiDim[2][1] = 1;

        int [][] dim = {{2,3,6},{3,8},{4,3,5,12,25}};

        System.out.println("dim[2][3] = " + dim[2][3]);

        System.out.println("Arrays.toString(dim) = " + Arrays.toString(dim));
        System.out.println("Arrays.deepToString(dim) = " + Arrays.deepToString(dim));

        for(int [] di : dim){
            for (int d : di){
                System.out.print(d+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim[i].length; j++) {
                System.out.print(dim[i][j]+" ");
            }
            System.out.println();
        }
    }


}
/*
    Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
    olusturacagimiz tek katli bir array’e bu toplamlari atayin.
    input : int[][] arr = {{3,4,5}, {2,3,6,7};
    output: [5, 7, 11]
 */
