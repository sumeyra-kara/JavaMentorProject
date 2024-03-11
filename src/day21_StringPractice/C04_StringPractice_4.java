package day21_StringPractice;

public class C04_StringPractice_4 {
    public static void main(String[] args) {
        System.out.println(ilkBesHarf("Ha"));
        System.out.println(ilkNHarf("Sakar", 7));
        System.out.println(ilkNHarf_1("Kabakulak", 15));
    }
    /*
    Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini döndürün. 5 karakterin
    altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    Sabun Sabun
    Merhaba Merha
    Ali Ali..
    Hey Hey..
    Pi Pi…
     */

    public static String ilkBesHarf(String str){

        if (str.length()>=5){
            return str.substring(0,5);
        }
        for (int i = str.length(); i <5 ; i++) {
            str+=".";
        }
        return str;
    }

    public static String ilkNHarf(String str, int n){

        if (str.length()>=n){
            return str.substring(0,n);
        }
        for (int i = str.length(); i <n ; i++) {
            str+=".";
        }
        return str;
    }

    public static String ilkNHarf_1(String str, int n){

        if (str.length()>=n){
            return str.substring(0,n);
        }

        int strBoy = str.length();

        str = str+".".repeat(n-strBoy);

        return str;
    }
}
