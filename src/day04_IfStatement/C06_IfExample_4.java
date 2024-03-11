package day04_IfStatement;

import java.util.Scanner;

public class C06_IfExample_4 {
    public static void main(String[] args) {
         /*
        Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

         */

        int age = 58;

        if (age>=65){
            System.out.println("Emekli olabilirsiniz.");
        }else{
            System.out.println(65-age + " yıl daha çalışmalısınız.");
        }

        /*
        Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        olup olmadigini yazdirin.

        not : büyük harfler 65 ila 90 arasındadır (ascii)
         */

        char ch = 'A';

        if (ch>=65 && ch<=90){
            System.out.println("Büyük harftir.");
        }else {
            System.out.println("Büyük harf değildir.");
        }


       // System.out.println('A'+1);

        /*
        Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        olarak yazdirin, yoksa girilen harfi yazdirin.
        not : küçük harfler 97 ila 122 arasındadır (ascii)
         */

        char letter = 'g';
        char newLetter;

        if (letter>=97 && letter<=122){
            newLetter = (char) (letter-32);
            System.out.println(newLetter);
        } else {
            System.out.println(letter);
        }


    }
}
