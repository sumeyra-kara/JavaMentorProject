package day18_ScannerPractice;

import java.util.Scanner;

public class C01_Practice_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İki sayı giriniz (ilki ondalık, ikincisi tam sayı olsun)");
        double db = scanner.nextDouble();
        int i = scanner.nextInt();

        System.out.println("Girilen sayıların toplamı : "+(i+db));
        System.out.println("Girilen sayıların çarpımı : "+(i*db));


    }
    /*
    Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
    yazdirin.
     */
}
