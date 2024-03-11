package day07_ForLoops;

public class C02_ForLoop_2 {
    public static void main(String[] args) {

        // 0'dan 100'e kadar olan sayıları yazdıralım

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println("---------------------");
        // 15'den 100'e kadar olan sayıları yazdıralım

        for (int i = 15; i < 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println("---------------------");

        //100'den 0'a kadar sayıları yazdıralım

        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("---------------------");
        // 0'dan 100'e kadar olan çift sayıları yazdıralım

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print("çift ");
            }
            if (i % 2 == 1) {
                System.out.print("tek ");
            }
        }

        System.out.println("---------------------");
        // 0'dan 100'e kadar olan çift sayıları yazdıralım  2.yol

        for (int i = 1; i <= 100; i+=2) {

                System.out.print(i + " ");

        }

        // 1-100 'e kadar olan sayıların tolamını alalım
    }
}
