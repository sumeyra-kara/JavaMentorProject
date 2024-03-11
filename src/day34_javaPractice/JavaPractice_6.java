package day34_javaPractice;

import java.util.Arrays;

public class JavaPractice_6 {
    public static void main(String[] args) {

        String s = "red2 blue4 black3 yellow1 green6 gold5";

        String s1 = "red224 blue550 black391 yellow0 green2 gold57809";

     //   System.out.println("orderColors_1(s) = " + orderColors_1(s));
        System.out.println("orderColors_2(s1) = " + orderColors_2(s1));
    }
    // String str = "red2 blue4 black3 yellow1 green6 gold5"
    // String result = "yellow red black blue gold green"

    // String str = "red22 blue41 black3 yellow178 green6 gold5222"
    // String result = "black green red blue yellow gold"

    // rakamlarda sort metodu küçükten büyüğe doğru dize
    //Stringlerde sort metodları nasıl çalışır?
    //Sözlük gibi bakar
    // 11  9 dan önce gelir
    //aba
    //ada

    public static String orderColors_1(String str){
        String[] colors = str.split(" ");
      //  System.out.println("Arrays.toString(colors) = " + Arrays.toString(colors));

        for (int i = 0; i < colors.length; i++) {
            colors[i] = colors[i].charAt(colors[i].length()-1)+colors[i];
          //  colors[i] = colors[i].substring(colors[i].length()-1)+colors[i];
        }

       // System.out.println("Arrays.toString(colors) = " + Arrays.toString(colors));

        Arrays.sort(colors);

      //  System.out.println("Arrays.toString(colors) = " + Arrays.toString(colors));


        String result = String.join(" ", colors); // ["dfdfd","sdsd"]  -- "dfdfd dfdfd"

      //  System.out.println("result = " + result);

        result = result.replaceAll("[0-9]","");

        return result;
    }

    public static String orderColors_2(String str){
        String[] colors = str.split(" ");
      //  System.out.println("Arrays.toString(colors) = " + Arrays.toString(colors));

        for (int i = 0; i < colors.length; i++) {
            for (int j = i+1; j < colors.length; j++) {
                if (Integer.parseInt(colors[i].replaceAll("[^0-9]","")) >
                        Integer.parseInt(colors[j].replaceAll("[^0-9]",""))){
                    String temp = colors[i];
                    colors[i] = colors[j];
                    colors[j] = temp;
                }
            }

        }

    //    System.out.println("Arrays.toString(colors) = " + Arrays.toString(colors));
        String result = "";

        for (String color : colors){
            result+=color.replaceAll("[0-9]","")+" ";
        }

        return result.trim();
    }

}



