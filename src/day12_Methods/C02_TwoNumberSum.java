package day12_Methods;

import java.util.Scanner;

public class C02_TwoNumberSum {

    public static void main(String[] args) {
      //  twoNumberSumAndPrint();

        twoNumberSumAndPrintWithParameters(8,15);
    }

    public static void twoNumberSumAndPrint(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("İki sayı giriniz");
        int i= scanner.nextInt();
        int j = scanner.nextInt();


        System.out.println(i+j);
    }

    public static void twoNumberSumAndPrintWithParameters(int sayi1, int sayi2){
        System.out.println(sayi1+sayi2);
    }

}
