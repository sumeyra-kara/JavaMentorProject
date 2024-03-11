package day34_javaPractice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JavaPractice {
    public static void main(String[] args) {
        String s = "132 29 65 29998 8795 11 10 9 87 1011";
        // 6  11 11 10  29   2 1  9 15
        // cevap  --> "1 2 6 9 10 11 11 15 29"

        System.out.println("sumOfNumber(s) = " + sumOfNumber(s));

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ali","Ahmet","Şeyma"));
        String joined = String.join("-", names);
        System.out.println("joined = " + joined);
    }

    public static String sumOfNumber (String str){
        String[] arrStr = str.split(" ");
      //  System.out.println("Arrays.toString(arrStr) = " + Arrays.toString(arrStr));

        int [] arrStrSums = new int[arrStr.length];

        for (int i = 0; i < arrStr.length; i++) {
           arrStrSums[i]= sumOfString(arrStr[i]);
        }

     //   System.out.println("Arrays.toString(arrStrSums) = " + Arrays.toString(arrStrSums));

        Arrays.sort(arrStrSums);

      //  System.out.println("Arrays.toString(arrStrSums) = " + Arrays.toString(arrStrSums));

        String result = "";

        for (int i = 0; i < arrStrSums.length; i++) {
            result += arrStrSums[i]+" ";
        }

//        ArrayList <String>list = new ArrayList<>();
//
//        for (int i = 0; i < arrStrSums.length; i++) {
//            list.add(String.valueOf(arrStrSums[i]));
//        }
//
//        String result = String.join( " ",list);

        return result;
    }

    private static int sumOfString(String s){
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
           result += Integer.parseInt(s.substring(i,i+1));
        }
        return result;
    }
}
