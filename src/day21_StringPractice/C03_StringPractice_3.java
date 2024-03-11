package day21_StringPractice;

public class C03_StringPractice_3 {
    public static void main(String[] args) {
        System.out.println("harfSay(\"Amerikan Eez      i\") = " + harfSay("Amerikan Ee          zi",'e'));
        System.out.println("harfSay(\"Engelli koşu parkuru\",\"u\") = " + harfSay("Engelli koşu parkuru", "u"));
    }
    /*
    Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
    edilecek, boşluk varsa silinecek)
    Ankara,a 3
    Edirne,e 2
     */

    public static int harfSay(String str, char ch){
        str = str.toLowerCase().replace(" ","");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }

    public static int harfSay(String str, String ch){
        str = str.toLowerCase().replace(" ","");
        ch = ch.toLowerCase();
        int count = str.length()-str.replace(ch,"").length();
        return count;
    }
}
