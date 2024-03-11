package day10_IfandLoopsPractice;

import java.util.Scanner;

public class C01_YuzeKadarToplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int count = 0;

        while (toplam <= 100) {
            System.out.println("Sayıyı giriniz");
            int sayi = scanner.nextInt();
            toplam += sayi;
            count++;
        }

        System.out.println("Toplam : " + toplam);
        System.out.println("count = " + count);

    }
}
