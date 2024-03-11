package day14_MethodPractice;

public class C01_MethodPractice_1 {
    public static void main(String[] args) {
        intString(6,"Ali",false);
    }

    /*
    Bir method yazın 3 parametreli olsun. İnt ve String type
    ve bir de boolean. Boolean true ise int ve String değeri
    concat yapsın ve yazdırsın. False ise başka bir methodu çağırsın ve
    String değeri int kadar yazdırsın.
     */
    public static void intString(int sayi, String kelime, boolean bl){
        if (bl){
            System.out.println(kelime+sayi);
        }else {
           kereKadarYazdir(sayi,kelime);
        }
    }

    public static void kereKadarYazdir(int kere, String sozcuk){
        for (int i = 0; i < kere; i++) {
            System.out.println(sozcuk);
        }
    }

}


/*
        metod oluştururken
        1- public/static yazılacak (şimdilik)
        2- bu metod bana ne verecek? veri ise return Type olacak (veri tipi) yoksa void olacak
        3- metod ismi verilir (camelCase)
        4- metod parentezi ()  --> eğer metodum çalışmak için veriye ihtiyaç duyuyorsa buraya bu veri için giriş parametresi sağlanır.
        5- metod body.si  // kod kısmı
        6- metod çağırılmalıdır.
         */