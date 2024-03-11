package day05_If_ElseIf;

public class C02_If_ElseIf_Practice {
    public static void main(String[] args) {
        /*
        Kullanicidan artik yil olup olmadigini kontrol
        etmek icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil
        degildir
        Kural 2: 4 ile bolunup 100 ile bolunemeyen
        yillar artik yildir
        Kural 3: 4’un kati olmasina ragmen 100 ile
        bolunebilen yillardan sadece
        400’un kati olan yillar artik yildir

         */

        int year = 1600;

        if (year % 4 != 0) {
            System.out.println("Artık yıl değildir.");
        } else if (year % 100 != 0) {
            System.out.println("Artık yıldır");
        } else if (year % 400 == 0) {
            System.out.println("Artık yıldır");
        } else {
            System.out.println("Artık yıl değildir");
        }

        /*
        Haftanın belirli günleri 0 = Pazar, 1 = Pazartesi, 2 = Salı, 3 = Çarşamba, 4 = Perşembe, 5 = Cuma,
        6 = Cumartesi.
        ve tatilde olup olmadığımızı gösteren bir boole değeri.
        Bize ne zaman kalkacağımızı söyleyen bir dize almak istiyoruz.
        Çalar saat hafta içi sabah 7.00'de, hafta sonu ise sabah 10.00'da çalar.

        Tatilde olmadığımız sürece alarm hafta içi sabah 10'da çalıyor
        ve hafta sonları tamamen kapalıdır.

*/

        int bulunulanGun = 0;
        boolean isHoliday = false;


        if ((bulunulanGun >= 1 && bulunulanGun <= 5) && (!isHoliday)) {
            System.out.println("Saat 07:00'da çalar saat çalışsın");
        } else if ((bulunulanGun == 0 || bulunulanGun == 6) && (!isHoliday)) {
            System.out.println("Saat 10:00'da çalar saat çalışsın");
        } else if (isHoliday) {
            if (bulunulanGun >= 1 && bulunulanGun <= 5) {
                System.out.println("Saat 10:00'da çalar saat çalışsın");
            } else {
                System.out.println("Çalar saat kapalı");
            }
        }
    }
}
