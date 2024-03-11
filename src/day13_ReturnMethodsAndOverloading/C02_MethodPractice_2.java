package day13_ReturnMethodsAndOverloading;

public class C02_MethodPractice_2 {


    // girilen doları Tl'ye çeviren metodu yazınız  1$ = 30.15 ,
    // dolar kuru hergün değiştiğinden, metod kullanıcıdan kuru da alsın.

    public static double convertDollarToTl(double amountOfDollar, double exchangeRate){
        return amountOfDollar*exchangeRate;
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