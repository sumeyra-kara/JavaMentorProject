package day25_WrapperClasses;

public class C03_WrapperClassMethods {
    public static void main(String[] args) {
        /*
        Character.isLeter()  --- harf olup olmadığına bakar
        Character.isDigit()  --- rakam olup olmadığına bakar
        Character.isAlphabetic()  --- harf olup olmadığına bakar
        Character.isLetterOrDigit()  --- harf/rakam olup olmadığına bakar
         */

        String str = "^+!j4    564*/-a_   |v-:!a ???(        )&+";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                result += str.charAt(i);
            }
        }

        System.out.println("result = " + result);

        String s = String.valueOf(365);
        System.out.println("s.length() = " + s.length());

        String numeros = "235 25 9 97 23 65 2118 2";

        // cevap bir string olacak ve sayı değerleri toplanarak küçükten büyüğe sıralanacak
        // 2 5 7 9 10 11 12 16

    }


}
