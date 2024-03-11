package day30_encapsulation_static;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class BankaMusterisi {

    public final static String bankaSubeAdi = "Beylikdüzü Garanti BBVA";

    private String adSoyad;
    private String hesapNo;
    private double bakiye;
    private static int musteriNo = 1;
    private static String adminSifre;

    static {
        adminSifre = LocalDateTime.now().getDayOfMonth() + bankaSubeAdi.substring(0, 3);
        System.out.println("Admin şifre oluşturuldu...");
        System.out.println("adminSifre = " + adminSifre);
    }

    {
        System.out.println("Her kayıt alınırken hesap no otomatik oluşturulacaktır.");
    }

    public BankaMusterisi() {
        setHesapNo();
        System.out.println("Consructor çalıştı");
    }

    public void setAdSoyad(String adSoyad) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Admin şifresini giriniz : ");
        String girilenSifre = scanner.nextLine();

        if (girilenSifre.equals(adminSifre)) {
            this.adSoyad = adSoyad;
            System.out.println("Ad soyad girişi/değişikliği yapılmıştır.");
            return;
        }

        System.out.println("Ad soad değişikliği/girişi yapma yetkşiniz YOKTUR.");
    }


    private void setHesapNo() {
        Random random = new Random();
        int randomSayi = random.nextInt(999999999) + 100000000;
        int randomSon = random.nextInt(89) + 10;
        String hesapNo = "TR" + musteriNo + randomSayi + " 0000 0007 1254" + randomSon;
        musteriNo++;
        this.hesapNo = hesapNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraYatirma(double miktar) {
        if (miktar > 0) bakiye += miktar;
    }

    public void paraCekme(double miktar) {
        if (miktar <= 0) System.out.println("Hatalı giriş yaptınız.");
        if (miktar < bakiye) {
            bakiye -= miktar;
        } else {
            System.out.println("Yetersiz bakiye...!");
        }
    }

    public void bakiyeKontrol(){
        if (bakiye>10_000_000){
            System.out.println("Özel Müşteri");
            System.out.println(adSoyad+ "'nın özel tel numarası 02124582525'dir");
        }else{
            System.out.println(adSoyad+ " özel müşteri değildir.");
        }
    }

    public static void hesapAcmaKurallari(BankaMusterisi bankaMusterisi){
        System.out.println(bankaSubeAdi+ " hesap açma usulleri : "+ bankaMusterisi.getAdSoyad());
        System.out.println("1- Her müşteri adı admin şifre ile girilecektir");
        System.out.println("2- Bakiyesi 10.000.000 $ üzeinde olanlar özel müşteridir.Bu husus sürekli kontrol edilecektir");
        System.out.println("3- Yeni müşterilere hoş geldin hediyesi olarak BonusCard verilecektir");
    }

    @Override
    public String toString() {
        return "BankaMusterisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", hesapNo='" + hesapNo + '\'' +
                ", bakiye=" + bakiye +
                '}';
    }

    public static class subClass {
            public void print(){
                System.out.println("SubClasstan geliyorum");
            }
    }
}
