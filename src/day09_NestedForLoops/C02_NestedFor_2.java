package day09_NestedForLoops;

public class C02_NestedFor_2 {
    public static void main(String[] args) {
        /*
         1 1 1 1 1 1
         1 1 1 1 1 1
         1 1 1 1 1 1
         1 1 1 1 1 1
         1 1 1 1 1 1
         1 1 1 1 1 1
         */

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.print(1+" ");
            }
            System.out.println();
        }

        System.out.println("----------------------");

        /*
        ******
        *****
        ****
        ***
        **
        *
         */

        int number = 10;
        for (int i = 0; i <number ; i++) {
            for (int j = number-i; j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------------");


        for (int i = number; i >0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
