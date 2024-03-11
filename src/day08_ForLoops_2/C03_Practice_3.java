package day08_ForLoops_2;

public class C03_Practice_3 {
    public static void main(String[] args) {
        //Kitap sorusu: Rafta 10 tane kitap var elimde 100 tane kitap var.
        //Raf 50 kitap alıyor. Kapasitesi dolunca bana mesaj versin.

        int mevcutKitap = 10;
        int yeniKitap = 100;
        int kapasite = 50;

//        for (int i = mevcutKitap + 1; i <= yeniKitap; i++) {
//            if (i <= kapasite) {
//                System.out.println(i + "'nci kitap rafa koyuldu.");
//            } else {
//                System.out.println("Raf dolu. " + i + "'nci kitap rafa koyulamadı.");
//            }
//        }

        // girilen bir sayının asal olup olmadığını kontrol edin ve asalsa asal sayıdır yazdırın.

        int sayi = 77;
        boolean asalMi=true;

        for (int i = 2; i <=sayi/2 ; i++) {
            if (sayi % i == 0){
                asalMi = false;
                break;
            }
        }


        if (asalMi)
            System.out.println(sayi+ " asaldır.");
        else
            System.out.println(sayi+ " asal değildir.");

    }
}
