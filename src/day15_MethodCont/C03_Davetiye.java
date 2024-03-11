package day15_MethodCont;

import java.util.Scanner;

public class C03_Davetiye {

    public static void main(String[] args) {

        davetiyeSusleme();


    }

    /*
    Düğün kartı bastıran bir program yazın.
    Kullanıcıdan 2 adet isim isteyen bir metodunuz olsun. Eğer
    kullanıcı isimleri yanlışlıkla aynı girerse. Başka bir metot çağrılsın ve
    kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
    istesin. Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
    bağlayıp (concat) önünü ve arkasını yıldızlarla süsleyip versin
     */

    public static void davetiyeSusleme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gelin ve Damadın isimlerini giriniz");
        String isim1=scanner.nextLine();
        String isim2=scanner.nextLine();
        if (isim1.equals(isim2)){
          isimDuzeltme();
        }else {
            susleme(isim1,isim2);
        }
    }

    public static void isimDuzeltme(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsimler aynıdır. Lütfen tekrar giriniz");
        String duzeltilenIsim1 =scanner.nextLine();
        String duzeltilenIsim2 =scanner.nextLine();
        susleme(duzeltilenIsim1,duzeltilenIsim2);
    }

    public static void susleme(String isim1, String isim2){
        System.out.println("**********"+isim1+"*****"+isim2+"************");
    }
}
