package day12_Methods;

public class C01_MethodsIntro {
    public static void main(String[] args) {
        hello();
        hello();
        merhaba();
        hello();
        merhaba();

        String name = "Ahmet";

        /*
        metod oluştururken
        1- public/static yazılacak (şimdilik)
        2- bu metod bana ne verecek? veri ise return Type olacak (veri tipi) yoksa void olacak
        3- metod ismi verilir (camelCase)
        4- metod parentezi ()  --> eğer metodum çalışmak için veriye ihtiyaç duyuyorsa buraya bu veri için giriş parametresi sağlanır.
        5- metod body.si  // kod kısmı
        6- metod çağırılmalıdır.
         */

    }
    public static void hello(){
        System.out.println("Hello");
        merhaba();
    }

    public static void merhaba(){
        System.out.println("Merhaba");
    }
}
