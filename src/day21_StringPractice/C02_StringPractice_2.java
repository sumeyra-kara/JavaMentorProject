package day21_StringPractice;

public class C02_StringPractice_2 {
    public static void main(String[] args) {
        //   ucDefaYazdir("Merhaba");
        //   System.out.println("nDefaYazdir(\"Merhaba\",4) = " + nDefaYazdir("Merhaba", 4));
//        String str ="Ahmet";
//        System.out.println("str = " + str);
//        str = str.repeat(5);
//        System.out.println("str = " + str);

        System.out.println("nDefaYazdirRepeat(\"Merhaba\", 5) = " + nDefaYazdirRepeat("Merhaba", 5));

    }

    /*
    Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    Merhaba MMMeeerrrhhhaaabbbaaa
    Ali AAAllliii
     */

    public static void ucDefaYazdir(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result += str.charAt(i);
            }

        }

        System.out.println("result = " + result);

    }

    public static String nDefaYazdir(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < n; j++) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String nDefaYazdirRepeat(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(i, i + 1).repeat(n);
        }
        return result;
    }
}
