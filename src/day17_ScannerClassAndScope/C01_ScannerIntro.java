package day17_ScannerClassAndScope;

import java.util.Scanner;

public class C01_ScannerIntro {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen yaşınızı ve adınızı giriniz : ");
        double age = scanner.nextDouble();
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println(name+" "+age+" yaşındadır..");

        scanner.close();

    }
}
