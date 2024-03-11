package day25_WrapperClasses;

import java.util.Arrays;

public class C04_Practice {
    public static void main(String[] args) {
        String  [] str = {"Ali","Veli","Hasan","Ahmet"};
        String  [] str1 = {"Ayşe","Mine","Seda","Ece","Melike"};

        String [] birlestirilmis = new String[str.length+ str1.length];

//        birlestirilmis[0] = str[0];
//        birlestirilmis[1] = str[1];
//        birlestirilmis[2] = str[2];
//        birlestirilmis[3] = str1[0];
//        birlestirilmis[4] = str1[1];
//        birlestirilmis[5] = str1[2];
//        birlestirilmis[6] = str1[3];

        for (int i = 0; i < birlestirilmis.length; i++) {
            if (i<str.length){
                birlestirilmis[i] =str[i];
            }else{
              birlestirilmis[i]  = str1[i- str.length];
            }
        }

        System.out.println(Arrays.toString(birlestirilmis));

    }
}
