package day21_StringPractice;

import java.util.Scanner;

public class C01_StringPractice_1 {
    public static void main(String[] args) {
        //   System.out.println("kacKelime() = " + kacKelime());
//        System.out.println("kacKelime_1() = " + kacKelime_1());
      //  System.out.println("ortalamaHarf() = " + ortalamaHarf());
        String str = "Ahmet Ay ";
        System.out.println("str.replace(\" \",\"%\") = " + str.replace(" ", "%"));
    }

    /*
    Kullanıcıdan bir cümle alınacak.. kaç kelimeden oluştuğu bulunacak.. .. kelimelerin ortalama uzunluğu
     */
    public static int kacKelime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    public static int kacKelime_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.substring(i, i + 1).equals(" ")) {
                count++;
            }
        }
        return count + 1;
    }

    public static int kacKelime(String cumle) {
        int count = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    public static int ortalamaHarf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();
        int bosluk_sayisi = kacKelime(cumle) - 1;
        int kelime_sayisi = kacKelime(cumle);
        int cumleBoyu = cumle.length();

        return (cumleBoyu-bosluk_sayisi)/kelime_sayisi;
    }
}
