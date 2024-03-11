package day14_MethodPractice;

import java.util.Scanner;

public class C02_MethodPractice_2 {
    public static void main(String[] args) {

         yazdirma(sayiIslem());
    }

    /*
    Konsoldan kullanıcıdan 2 sayı almanızı sağlayan bir
    metodu çağırın. İkinci sayı 3 ün katı olan bir sayı değilse,
    başka bir metodtan geçirin ve 3. katı olacak şekilde size
    döndürsün. Sonra bu sayıları kabul eden başka bir
    metotla da sayıları toplayın.
     */

    public static int sayiIslem(){
        Scanner inputs = new Scanner(System.in);
        System.out.println("İki sayı giriniz : ");
        int x = inputs.nextInt();
        int y = inputs.nextInt();

        if (!(y % 3 == 0)){
           y= ucunKatiYap(y);
        }
        return toplaSayilari(x,y);
    }

    private static int toplaSayilari(int x, int y) {
        return x+y;
    }

    public static int ucunKatiYap(int sayi) {
        return sayi*3;
    }

    public static void yazdirma(int i){
        System.out.println(i);
    }
}
