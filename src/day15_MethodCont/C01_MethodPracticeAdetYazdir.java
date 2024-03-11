package day15_MethodCont;

import java.util.Scanner;

public class C01_MethodPracticeAdetYazdir {
    public static void main(String[] args) {
      //  adetYazdir();
        adetYazdir("x",4);

    }

    // girilen bir ismin kaç adet yazdırılacağı da sorulsun.. eğer x girilse işlem sonlansın

    public static void adetYazdir() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Yazdırılacak adı ve yazdırma adedini giriniz... (Çıkış için x'e basınız)");
            String ad = scanner.nextLine();
            if (!ad.equals("x")) {
                int adet = scanner.nextInt();
                scanner.nextLine();

                for (int i = 1; i <= adet; i++) {
                    System.out.print(ad + " ");
                }
                System.out.println();
            } else {
                System.out.println("Çıkış yaptınız...");
                break;
            }
        }
    }

    public static void adetYazdir(String ad, int adet){
        if (!ad.equals("x")){
            for (int i = 0; i < adet; i++) {
                System.out.print(ad+" ");
            }
            System.out.println();
        }else {
            System.out.println("x'e bastınız.. program sonlandı");

        }
    }
}
