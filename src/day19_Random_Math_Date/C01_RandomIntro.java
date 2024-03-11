package day19_Random_Math_Date;


import java.util.Random;

public class C01_RandomIntro {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("random.nextInt() = " + random.nextInt());
        System.out.println("random.nextDouble() = " + random.nextDouble());
        System.out.println("random.nextBoolean() = " + random.nextBoolean());

        //aralık belirleme
        System.out.println(random.nextInt(100));   //  sıfırdan itibaren bound hariç  0-99
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("random.nextInt(90)+10 = " + (random.nextInt(91) + 10));     //10-99
//        }

        System.out.println(random.nextInt(10) - 10);

        // random(high-low)+low   ----> low high-1   arasında sayı üretir.

        //75 - 88 arasında sayı veren kodu yazalım..
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(88 - 75) + 75);
        }



    }
}
