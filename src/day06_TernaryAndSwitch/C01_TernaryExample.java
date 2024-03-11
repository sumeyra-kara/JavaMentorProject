package day06_TernaryAndSwitch;

public class C01_TernaryExample {
    public static void main(String[] args) {
        // girilen bir pozitif tam sayı
        // eğer çiftse "sayı çift"
        // değilse "sayı tek" yazdıralım.
        // ternary kullanarak yapalım.

        int number = 10;

        if (number % 2 == 0)
            System.out.println("Sayı Çift");
        else
            System.out.println("Sayı Tek");


        System.out.println(number % 2 == 0 ? "Sayı Çift" : "Sayı Tek");

        String sonuc = number % 2 == 0 ? "Sayı Çift" : "Sayı Tek";

        System.out.println(sonuc);

        System.out.println("---------------------");

        //girilen bir sayının mutlak değerini alın ve yazdırın.

        int x = 9;

        if (x >= 0)
            System.out.println(x);
        else {
            x = -x;
            // x=-1*x;
            System.out.println(x);
        }

        int y = -9;

        y = y >= 0 ? y : -y;
        System.out.println("y = " + y);

        System.out.println("-----------------");

        //  z % 2 == 0 ? "z çift" : "z tek";  bu şekilde java bunu bir
        //  statement olarak kabul etmez ve hata verir

        // z sayısı ikii tam bölünürse "Sayı Çifttir" bölünmezse
        // z ye iki katını atayın

        int z = 16;

        System.out.println(z % 2 == 0 ? "Sayı Çifttir" : z * 2);

        /*
        kullanıcıdan bir ücgenin üç kenarını alın, eğer eşit iseler
        bu bir eşkenar üçgendir yazdırın..
        değilse eşkenar üçgen değildir.
         */

        int kenar1 = -12;
        int kenar2 = -12;
        int kenar3 = -12;

        System.out.println(kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0 ? "bir eşkenar üçgendir." : "eşkenar " +
                "üçgen değildir.");

        /*
        girilen harf kucuk ise buyuk yazsın değilse aynen yazsın.
         */

        char harf='B';

        harf = harf >= 'a' && harf <= 'z' ? (char) (harf-32) : harf;

        System.out.println("harf = " + harf);


    }
}
