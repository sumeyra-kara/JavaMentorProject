package day10_IfandLoopsPractice;

import java.util.Scanner;

public class C03_Fibonacci {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Fibonacci serisi için iki rakam giriniz : ");
        double ilkSayi= scanner.nextDouble();
        double ikinciSayi= scanner.nextDouble();
        //1 2  3  5  8  13   21  34 ....

        for (int i = 0; i < 100; i++) {
            System.out.println(ilkSayi);
            System.out.println(ikinciSayi);
            ilkSayi += ikinciSayi;
         //   double top = ilkSayi+ikinciSayi;
            ikinciSayi+= ilkSayi;


            //altın oran
            double d = ikinciSayi/ilkSayi;
            System.out.println("altinOran = " + d);
        }
    }
}
