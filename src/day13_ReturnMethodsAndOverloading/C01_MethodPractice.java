package day13_ReturnMethodsAndOverloading;

public class C01_MethodPractice {
    public static void main(String[] args) {
        sayHello();
        int sonuc = sum();
        System.out.println("sonuc = " + sonuc);
        //parametreli
        double d = sum_2(2.8,5);
        System.out.println("d = " + d);


        // parametre olarak ad soyad ve yaş alan ve dönüş tipi olarak adın ve
        // soyadın ilk harfi ve yaşın eklenmesiyle oluşan şifreyi dönen metodu yazın..
        String soyad = "Ay";
        int age = 45;
        System.out.println("sifreOlusturma(\"Ihsan\",soyad,age) = " + sifreOlusturma("Ihsan", soyad, age));

        //method calling
        double result = C02_MethodPractice_2.convertDollarToTl(55,30.15);
        System.out.println("result = " + result);
    }

    public static void sayHello(){
        System.out.println("Merhaba Dünya");
    }

    public static int sum(){
        int x = 10;
        int y = 15;
        return (x+y);
    }

    public static double sum_2(double sayi1, double sayi2){
        return sayi1+sayi2;
    }

    public static String sifreOlusturma(String ad, String soyad, int yas){
        String sifre="";
        sifre+=""+ad.charAt(0)+soyad.charAt(0)+yas;
        return sifre;
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