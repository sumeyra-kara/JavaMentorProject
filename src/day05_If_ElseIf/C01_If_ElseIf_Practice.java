package day05_If_ElseIf;

public class C01_If_ElseIf_Practice {
    public static void main(String[] args) {


        int i = 1;

        if (i == 1) {
            System.out.println("if bloğu");
            i++;
        } else if (i == 2) {
            System.out.println("else-if bloğu");
        } else {
            System.out.println("else bloğu");
        }
        System.out.println("i = " + i);


        /*
        Verilen bir sayı eğer 3 e bölünüyorsa cizz yazsın
        eğer 5 e bölünüyorsa bizz yazsın
        eğer hem 3 e hem 5 e bölünüyorsa cizzbizz yazsın
         */

        int sayi = 45;

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("cizzbizz");
        } else if (sayi % 3 == 0) {
            System.out.println("cizz");
        } else if (sayi % 5 == 0) {
            System.out.println("cizz");
        }

        /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

         */

        int age = 36;
        char gender = 'K';

        if ((age >= 60 && gender == 'K') || (age >= 65 && gender == 'E')) {
            System.out.println("Emekli olabilirsiniz.");
        } else if (gender == 'K') {
            System.out.println(60 - age + " yıl daha çalışmanız gerekir.");
        } else if (gender == 'E') {
            System.out.println(65 - age + " yıl daha çalışmanız gerekir.");
        } else {
            System.out.println("Hatalı bilgi girdiniz. Lütfen düzeltiniz.");
        }
    }
}
