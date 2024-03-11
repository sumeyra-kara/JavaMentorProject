package day30_encapsulation_static;

public class BankaMusteriTest {
    public static void main(String[] args) {
        BankaMusterisi bankaMusterisi_1 = new BankaMusterisi();
        bankaMusterisi_1.setAdSoyad("Hasan Kaya");

        BankaMusterisi bankaMusterisi_2 = new BankaMusterisi();
        bankaMusterisi_2.setAdSoyad("Necla Sarıgüzel");

        bankaMusterisi_1.paraYatirma(1500);
        bankaMusterisi_1.paraYatirma(4500);

        bankaMusterisi_2.paraYatirma(100);
        bankaMusterisi_2.paraYatirma(400);

        bankaMusterisi_1.paraCekme(700);

        System.out.println("bankaMusterisi_1.getHesapNo() = " + bankaMusterisi_1.getHesapNo());
        System.out.println("bankaMusterisi_1.getAdSoyad() = " + bankaMusterisi_1.getAdSoyad());
        System.out.println("bankaMusterisi_1.getBakiye() = " + bankaMusterisi_1.getBakiye());

        System.out.println("bankaMusterisi_2.getHesapNo() = " + bankaMusterisi_2.getHesapNo());
        System.out.println("bankaMusterisi_2.getAdSoyad() = " + bankaMusterisi_2.getAdSoyad());
        System.out.println("bankaMusterisi_2.getBakiye() = " + bankaMusterisi_2.getBakiye());

        bankaMusterisi_1.paraYatirma(1000000000);
        bankaMusterisi_2.paraCekme(800);

       // BankaMusterisi.hesapAcmaKurallari();
        bankaMusterisi_1.bakiyeKontrol();
        bankaMusterisi_2.bakiyeKontrol();


        System.out.println(bankaMusterisi_1);
        System.out.println(bankaMusterisi_2);
    }
}
