package day20_StringClass;

public class C03_StringPractice {
    public static void main(String[] args) {
        // girilen bir sözcüğün ilk üç harfini döndüren metodu yazınız..
        // eğer üç harften kısa ise kendini döndürsün..

        System.out.println("ilkUcHarf(\"Ali\") = " + ilkUcHarf("Ali"));
        System.out.println("ilkUcHarf_2(\"Ali\") = " + ilkUcHarf_2("Ali"));

        //substring();
        //"Afyonkarahisar"
        // 012345
        String city ="Afyonkarahisar";
        String city1 ="Maraş";
        System.out.println("city1.substring(4,5) = " + city1.substring(4, 5));
        System.out.println("city.substring(1,4) = " + city.substring(1, 4));
        System.out.println("city.substring(1) = " + city.substring(1));

//        eachChar(city);
//        eachChar(city1);

        eachChar_1(city);
        eachChar_1(city1);
    }

    public static String ilkUcHarf(String str){
        String result = "";
        int length = str.length();
        if (length<3){
            return str;
        }
        for (int i = 0; i < 3; i++) {
            result+= str.charAt(i);
        }
        return result;
    }

    public static String ilkUcHarf_2(String str){

        int length = str.length();
        if (length<3){
            return str;
        }
        return str.substring(0,3);
    }

    public static void eachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void eachChar_1(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i,i+1));
        }
    }

}
