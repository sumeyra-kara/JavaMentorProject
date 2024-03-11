package day14_MethodPractice;

public class C03_MethodOverloadingPractice {
    public static void main(String[] args) {

        System.out.println("alan(5) = " + alan(5));
        System.out.println("alan(3,9) = " + alan(3, 9));
        System.out.println("alan(5,3.14) = " + alan(5, 3.14));

    }

    //alan hesabı yapan metodları yazınız

    public static int alan(int kenarUzunlugu){
        return kenarUzunlugu*kenarUzunlugu;
    }


    public static int alan(int kisaKaner, int uzunKenar){
        return kisaKaner*uzunKenar;
    }

    public static double alan(int yariCap, double pi){
        return pi*yariCap*yariCap;
    }

}
