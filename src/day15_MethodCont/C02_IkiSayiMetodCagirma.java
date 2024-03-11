package day15_MethodCont;

public class C02_IkiSayiMetodCagirma {
    public static void main(String[] args) {
        System.out.println("sayiIslem(2,6) = " + sayiIslem(2, 6));
        System.out.println("sayiIslem(5,10) = " + sayiIslem(5, 10));

    }

    /*
    Parametre olarak kullanıcıdan 2 sayı almanızı sağlayan bir
    metodu çağırın. İkinci sayı 3 ün katı olan bir sayı değilse,
    başka bir metodtan geçirin ve 3. katı olacak şekilde size
    döndürsün. Sonra bu sayıları kabul eden başka bir
    metotla da sayıları toplayın.

     */

    public static int sayiIslem(int x, int y){
        int sonuc =0;

        if (!(y % 3 ==0)){
            y=ucKatiYap(y);
        }

        sonuc=sayilariTopla(x, y);
        return sonuc;
    }

    public static int ucKatiYap(int sayi){
        return sayi-sayi%3;
    }
    public static int sayilariTopla(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }
}
