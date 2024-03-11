package day23_Arrays_2;

public class ArrayYazdirma {
    public static String yazdirma(String [] arr){
        String result ="[";
        for (String s : arr) {
            result+=s+", ";
        }
        result = result.substring(0,result.length()-2);
        return result+"]";
    }

    public static String yazdirma(int [] arr){
        String result ="[";
        for (int i : arr) {
            result+=i+", ";
        }
        result = result.substring(0,result.length()-2);
        return result+"]";
    }

    public static String yazdirma(char [] arr){
        String result ="[";
        for (char ch : arr) {
            result+=ch+", ";
        }
        result = result.substring(0,result.length()-2);
        return result+"]";
    }
}
