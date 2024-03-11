package day24_Arrays_3_Multi;

import java.util.Arrays;

public class C02_ArrayTasks {
    public static void main(String[] args) {
        int nums [] = {12,36,25,2,8};

        int[] kareler = kareler(nums);
        System.out.println("Arrays.toString(kareler) = " + Arrays.toString(kareler));
        String cumle ="Girilen bir cümlenin son kelimesini terse çevirip veren metodu yazınız";
        System.out.println("sonKelimeTers(cumle) = " + sonKelimeTers(cumle));
    }

    // n rakamlı bir arrayde bütün rakamların karesini
    // alarak yeni bir array oluşturan metodu yazalım

    public static int [] kareler (int [] para){
        int [] result = new int[para.length];

        for (int i = 0; i < para.length; i++) {
            result[i] = para[i]*para[i];
        }

        return result;
    }

    //Girilen bir cümlenin son kelimesini terse çevirip veren metodu yazınız.
    public static String sonKelimeTers(String str){
        String result = "";
        String [] kelimeler =str.split(" ");
        String sonKelime = kelimeler[kelimeler.length-1];
        result = reverse(sonKelime);

        return result;

    }

    public static String reverse(String s){
        String sonuc = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            sonuc+=s.charAt(i);
        }
        return sonuc;
    }

}
