package day04_IfStatement;

import java.util.Scanner;

public class C05_IfExample_3 {
    public static void main(String[] args) {

        /*
        girilen sayının tek mi çift mi olduğunu kontrol eden kodu yazınız...
         */

        int number = 24;

        boolean isOdd = number % 2 == 1;

        // System.out.println("isOdd = " + isOdd);

        if (isOdd) {
            System.out.println("Sayı tektir.");
        } else {
            System.out.println("Sayı çifttir.");
        }


        /*
        Kişinin yaşını alalım. 18'den küçükse giriş izni olmadığını ekrana yazdıralım.
         */

        int age = 18;

        if (age >= 18) {
            System.out.println("Hoş geldiniz.");
        } else {
            System.out.println("Girişiniz yasaktır.");
        }

        /*
        Kullanıcıdan üç uzunluk alalım. Eğer bunlar eşitse üçgen eşkenardır yazalım.
        Değilse eşkenar değildir yazalım..
         */

        int a = 8, b = 8, c = 9;

        if (a == b && b == c) {
            System.out.println("Eşkenardır.");
        } else {
            System.out.println("Eşekenar değildir.");
        }

        /*
        eğer x'in değeri 10 dan büyükse y'ye 20 atayın değilse y'ye 0 atayın..
         */

        int x = 5, y;

        if (x>10){
           y=20;
        }else{
            y=0;
        }

        System.out.println("y = " + y);




    }
}
