package day02_dataCasting_Operators;

public class DataCasting {
    public static void main(String[] args) {


        int i=50;
        double db=i;

        System.out.println("db = " + db);

        double db2=52;
        int i2;
        i2= (int) db2;

        System.out.println("i2 = " + i2);

        int sayi=256;
        byte b;

        b= (byte) sayi;

        System.out.println("b = " + b);

        long l=4452555211545l;

        int sayi2= (int) l;

        System.out.println("sayi2 = " + sayi2);

        byte b1=10;
        byte b2=10;
        byte b3;

        b3= (byte) (b1+b2);

        System.out.println("b3 = " + b3);

        int num=10;
        double num1=8;

        double result=num/num1;

        System.out.println("result = " + result);

        char ch='a';

        byte by= (byte) ch;

        System.out.println("by = " + by);

    }
}
