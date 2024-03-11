package day13_ReturnMethodsAndOverloading;

public class C03_BelirliAraliktaSayiToplama {
    public static void main(String[] args) {

        System.out.println(belirliAralikToplam(15, 43));
        System.out.println(belirliAralikToplam(25, 974));

    }

    // verilen başlangıç ve bitiş değerleri arasındaki sayıları toplayan ve dönen metodu yazalım..
    // 15 - 43


    public static int belirliAralikToplam(int ilk, int son){
        int sonuc = 0;
        for (int i = ilk; i <=son ; i++) {
            sonuc+=i;
        }
        return sonuc;
    }



}
