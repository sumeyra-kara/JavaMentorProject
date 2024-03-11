package day34_javaPractice;

public class JavaPractice_7 {
    public static void main(String[] args) {
        String str = "karBBbK25al**++ilik";
        System.out.println("firstUniqueCharacter_1(str) = " + firstUniqueCharacter_1(str));
    }
    // bir string içindeki ilk unique karakteri bulan metodu yazınız. case non-sensitive

    public static String firstUniqueCharacter_1(String str){
        str = str.replaceAll("[^A-Za-z]","").toLowerCase();
        System.out.println("str = " + str);
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                return Character.toString(str.charAt(i));
            }
        }
        return "No Unique Character";
    }

    public static String firstUniqueCharacter_2(String str){
        str = str.replaceAll("[^A-Za-z]","").toLowerCase();
       // buraya karakter varken boy ile yokken boy farkının 1' eşit olduğu
        // üzerinden geliştirilen kod yazılacak
        return "No Unique Character";
    }
}
