package day34_javaPractice;

import java.util.ArrayList;

public class JavaPractice_5 {
    public static void main(String[] args) {
        String s = "ahmet";
        String iban  = "TR 4005 0000 1256 000 12522522";
        // ahmet ahme    ahm   ah     a   i =0
        //(0,5) ,(0,4)   (0,3) (0,2) (0,1)

        //hmet    hme      hm        h    i=1     met me m et e t
        //(1,5) (1,4)    (1,3)    (1,2)
        System.out.println(subStrControl("ahmet", "het"));
        System.out.println(subStrControl_1("ahmet", "hmet"));


    }
    // bir stringin bütün substringlerini kontrol eden metod nedir?
    private static boolean subStrControl(String str, String subStr) {
        ArrayList<String> allSubs = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() ; j >i; j--) {
                String sub = str.substring(i,j);
                allSubs.add(sub);
            }
        }
        System.out.println(allSubs);

        boolean result = allSubs.stream().anyMatch(elem->elem.equals(subStr));
        return result;
    }

    private static boolean subStrControl_1(String str, String subStr) {
        ArrayList<String> allSubs = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() ; j >i; j--) {
                String sub = str.substring(i,j);
                allSubs.add(sub);
            }
        }
        System.out.println(allSubs);

        for (int i = 0; i < allSubs.size(); i++) {
            if (allSubs.get(i).equals(subStr)){
                return true;
            }
        }
        return false;
    }


}
