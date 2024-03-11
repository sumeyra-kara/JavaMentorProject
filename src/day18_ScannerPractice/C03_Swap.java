package day18_ScannerPractice;

import java.util.Scanner;

public class C03_Swap {
    public static void main(String[] args) {
        swap_2();
    }

    public static void swap_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İki tam sayı giriniz");
        int ilkSayi = scanner.nextInt();
        int ikinciSayi = scanner.nextInt();
        System.out.println(ilkSayi +"----"+ikinciSayi);

        int temp = ilkSayi;
        ilkSayi = ikinciSayi;
        ikinciSayi = temp;

        System.out.println(ilkSayi +"----"+ikinciSayi);

    }

    public static void swap_2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İki tam sayı giriniz");
        int ilkSayi = scanner.nextInt();
        int ikinciSayi = scanner.nextInt();

        System.out.println(ilkSayi +"----"+ikinciSayi);

        ilkSayi = ilkSayi+ikinciSayi;
        ikinciSayi = ilkSayi-ikinciSayi;
        ilkSayi= ilkSayi-ikinciSayi;

        System.out.println(ilkSayi +"----"+ikinciSayi);

    }
}
