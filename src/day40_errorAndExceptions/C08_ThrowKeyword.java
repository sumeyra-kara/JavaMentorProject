package day40_errorAndExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C08_ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Test başladı");

        System.out.println("Sigara almak için \n Yaşınızı giriniz");
        int girilenYas = new Scanner(System.in).nextInt();

        if (girilenYas < 0) {
            throw new InputMismatchException("Yaşınız eksi olamaz");
        }
        if (girilenYas > 18){
            System.out.println("Sigara alabilirsiniz");
        }else {
            throw new RuntimeException("Yaşınız uygun değil");
        }

        System.out.println("Test bitti");
    }
}
