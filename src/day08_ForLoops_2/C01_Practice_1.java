package day08_ForLoops_2;

public class C01_Practice_1 {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        dahil) 7 ila bolunebilen sayilari yazdirin.

         */

        int number = 114;

        for (int i = 1; i <= number; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("------------------------");

        //girilen sayıyı tersten yazdırın

        int sayi = 852254;
        int terstenSayi = 0;

        for (; sayi != 0; sayi /= 10) {
            int sonBasamak = sayi % 10;                    // 5       2
            terstenSayi = terstenSayi * 10 + sonBasamak;   //4  --- 45   --- 452
        }

        System.out.println("Girilen sayının tersi " + terstenSayi + "'dir.");

        /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucuk ise baslangıc ve bitiş değerinin değiştirin. (swap)

         */
        System.out.println("------------------------");


        int start = 15;
        int finish = 75;

        if (start > finish) {
            int temp = start;
            start = finish;
            finish = temp;
        }

        int sum = 0;

        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }

        System.out.println("sum = " + sum);

    }
}
