package day19_Random_Math_Date;

public class C02_Math {
    public static void main(String[] args) {
       // Math math = new Math();

        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(Math.pow(3, 2));
        System.out.println(Math.abs(-9));

       int i = (int) Math.pow(2,9);
        System.out.println("i = " + i);

        System.out.println(Math.pow(2.3, 3.8));

        System.out.println(Math.max(5, 9));

        System.out.println("Math.addExact(3,9) = " + Math.addExact(3, 9));

        System.out.println("Math.ceil(3.1) = " + Math.ceil(3.1));
        System.out.println("Math.floor(4.8) = " + Math.floor(4.8));
        System.out.println("Math.round(3.4) = " + Math.round(3.4));
        System.out.println("Math.round(3.5) = " + Math.round(3.5));

        System.out.println("Math.random() = " + Math.random());  //double

        //10-20 arası rastgele tam sayı nasıl üretilir.

//        for (int j = 0; j < 100; j++) {
//            int x =10+  (int) (Math.random()*11);
//            System.out.println("x = " + x);
//        }
        //  altsınır + int() Math.random()*range
        //  bize vereceği üst sınır (altsınır+range -1)

        // 25 - 38


        for (int j = 0; j < 200; j++) {
            int i1 = 25 + (int) (Math.random() * 14);  // 25-38
            System.out.println("i1 = " + i1);
        }

    }
}
