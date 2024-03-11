package day18_ScannerPractice;

import java.util.Scanner;

public class C02_Practice_2 {
    public static void main(String[] args) {
        yeniKayit_2();
    }
    /*
    Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
    Isminiz : John
    Soyisminiz : Doe
    Yasiniz : 44
    Kaydiniz basariyla tamamlanmistir
     */

    public static void yeniKayit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi giriniz : ");
        String isim = scanner.nextLine();

        System.out.println("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Soyisminizi giriniz : ");
        String soyisim = scanner.nextLine();

        System.out.println("İsminiz : "+isim+"\nSoyisminiz : "+soyisim+"\nYasiniz : "+yas+"\nKaydiniz basariyla tamamlanmistir");
    }

    public static void yeniKayit_2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("İsminizi giriniz : ");
        String isim = scanner.nextLine();

        System.out.println("Soyisminizi giriniz : ");
        String soyisim = scanner.nextLine();

        System.out.println("Yaşınızı giriniz : ");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : "+isim.charAt(0)+" "+soyisim+", "+yas);
    }

    /*
    Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
    Girilen bilgiler : J Doe, 44
     */


}
