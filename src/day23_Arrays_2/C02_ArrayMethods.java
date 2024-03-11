package day23_Arrays_2;

import java.util.Arrays;

public class C02_ArrayMethods {
    public static void main(String[] args) {
        //split
        //bir stringi istenilen yerlerden bölerek arraye atar..
        String str = "burdur";

        String[] strArr = str.split("r");

        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
        System.out.println("strArr.length = " + strArr.length);

        String sentence = "Akşam erken iner maphushaneye";
        String[] words = sentence.split(" ");
        System.out.println(ArrayYazdirma.yazdirma(words));

        sentence = sentence.replace(" ","");
        System.out.println(sentence);
        sentence = sentence.replace("",",");
        System.out.println(sentence);
        sentence =sentence.substring(1,sentence.length()-1);
        System.out.println(sentence);

        String[] chars = sentence.split("");
        System.out.println(ArrayYazdirma.yazdirma(chars));

        char[] charArray = sentence.toCharArray();
        System.out.println(ArrayYazdirma.yazdirma(charArray));

        char [] ch1 = {'1','e','2'};
        System.out.println(ch1);
        System.out.println(charArray);

        String city = "burdur";

        String[] split = city.split("ur");
        System.out.println(ArrayYazdirma.yazdirma(split));


    }
}
