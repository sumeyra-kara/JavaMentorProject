package day01_MyFirstJavaProgram;

import day16_Classes.Circle;

public class VariableTypes {
    public static void main(String[] args) {

        //byte   8 bit -128 to 127
        //short  16 bit -32768 to 32767
        //int    32 bit
        //long   64 bit
        //float  32 bit  6-7 basamak noktadan sonra
        //double 64 bit   15-16 basamak noktadan sonra
        //char  16 bit tek bir karakter
        //boolean 1 bit  1/0 'ın karşılığı olan  true veya false

        int i;  //deklarasyon
        i=10;   //başlatma veya değer atama

        i=i+20;

        char ch='0';

        i=ch+i;

        System.out.println("i = " + i);

        ch=97;

        System.out.println("ch = " + ch);

        System.out.println(ch);
        System.out.println("ch = " + ch);

        boolean bl=true;
        System.out.println("bl = " + bl);

        bl=(2>9);

        System.out.println("bl = " + bl);

        System.out.println(3==4);

        long l=888_585_588_555l;

        float fl=5.89f;
        double db=5.89;

        int sayi=15/8;

        System.out.println("sayi = " + sayi);


        double db_1=39.99;
        double db_2=19.99;
        double db_3=9.99;
        double db_4=9.99;

        double sonuc=db_1+db_2-db_3+db_4;

        System.out.println("sonuc = " + sonuc);

        int not=80, not1=90, ort;

        char ch1=758;
        System.out.println("ch1 = " + ch1);

        char ch2='d';

        System.out.println(ch2+25);

        String str="Ali";

        System.out.println(str.toLowerCase());

        Circle circle = new Circle();
        circle.r=4;
        System.out.println("circle.area() = " + circle.area());


    }
}
