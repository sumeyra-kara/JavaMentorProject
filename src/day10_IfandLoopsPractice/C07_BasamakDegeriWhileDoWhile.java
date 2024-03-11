package day10_IfandLoopsPractice;

public class C07_BasamakDegeriWhileDoWhile {
    public static void main(String[] args) {

        int sayi= 277;

        int toplamDeger=0;

        while (sayi>0){
//           int ilkBasamak= sayi % 10;
//           toplamDeger=ilkBasamak+toplamDeger;
//           sayi = sayi/10;   //      sayi/=10;

            toplamDeger+=sayi %10;
            sayi /=10;
        }

        System.out.println("toplamDeger = " + toplamDeger);

        sayi =2556;
        toplamDeger =0;

        do {
            toplamDeger+=sayi %10;
            sayi /=10;
        }while (sayi>0);

        System.out.println("toplamDeger = " + toplamDeger);

        do {
            System.out.println("Hello");
        }while (0==15);
    }
}
