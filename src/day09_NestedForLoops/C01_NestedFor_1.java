package day09_NestedForLoops;

public class C01_NestedFor_1 {
    public static void main(String[] args) {
       /*
       // verilen sayıya kadar çarpım tablosunu yapalım
       1 2 3 4 5     -->  1*1 1*2 1*3 1*4
       2 4 6 8  10    -->  2*1 2*2 2*3 2*4
       3 6 9 12  15   -->  3*1 3*2 3*3 3*4
       4 8 12 16  20  -->  4*1 4*2 4*3 4*4
       5 10 15 20 25
        */

        int sayi = 10;

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= sayi; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println();
        for (int i = 1; i <= sayi; i++) {
            System.out.print(3 * i + " ");
        }
        System.out.println();
        for (int i = 1; i <= sayi; i++) {
            System.out.print(4 * i + " ");
        }

        System.out.println();
        System.out.println("-------------------");

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
         */
        int number = 10;

        for (int i = 1; i <=number; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
