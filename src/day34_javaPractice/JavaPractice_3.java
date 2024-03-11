package day34_javaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaPractice_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("kabaks","alpa","aca","ala","yatay","asa"));


//        System.out.println(removePalindrome_1(list));
//        System.out.println(removePalindrome_2(list));
//        System.out.println(removePalindrome_3(list));
        System.out.println(removePalindrome_4(list));

    }
    // palindrome olanları listeden çıkaran metodu yazınız?

    public static ArrayList<String> removePalindrome_1(ArrayList<String> list){

        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
          if (!isPalindrome(list.get(i))) {
              resultList.add(list.get(i));
          }
        }
        return resultList;
    }

    public static ArrayList<String> removePalindrome_2(ArrayList<String> list){

        for (int i = 0; i < list.size(); i++) {
            if (isPalindrome(list.get(i))) {
               list.set(i,"palindrome");
            }
        }

        list.removeIf(element -> element.equals("palindrome"));
        return list;
    }

    public static ArrayList<String> removePalindrome_3(ArrayList<String> list){
        list.removeIf(element->isPalindrome_2(element));
        return list;
    }

    public static ArrayList<String> removePalindrome_4(ArrayList<String> list){

        for (int i = 0; i < list.size(); ) {
            if (isPalindrome(list.get(i))){
                list.remove(list.get(i));
            }else{
                i++;
            }
        }
        return list;
    }

    public static boolean isPalindrome(String str){
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static boolean isPalindrome_2(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String result = stringBuilder.toString();

        return result.equals(str);
    }
}
