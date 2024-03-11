package day08_ForLoops_2;

public class C02_Practice_2 {
    public static void main(String[] args) {
       /*
       Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        */

        int sayi = 10;
        int factorial = 1;

        System.out.print(sayi + "! = ");

        for (int i = sayi; i >= 1; i--) {
            factorial *= i;
            if (i != 1) {
                System.out.print(i + " * ");
            } else if (i == 1) {
                System.out.print(i + " ");
            }

        }

        System.out.println("= " + factorial);

        sayi = 10;

        int carpim = 1;
        int i;

        for (i = 1; i <= sayi; i++) {
            carpim *= i;
        }
        System.out.print(i - 1 + "!" + " = ");
        for (i = sayi; i > 1; i--) {

            System.out.print(i + " * ");
        }
        System.out.print(i);
        System.out.println(" = " + carpim);

        System.out.println("-------------------");


        int z=1;
        for (; ; ) {
            System.out.println("a");
            z++;
            if (z==5){
            break;
            }
        }



    }
}
