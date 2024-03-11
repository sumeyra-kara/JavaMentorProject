package day02_dataCasting_Operators;

public class ArithmeticOperators {

    public static void main(String[] args) {


        System.out.println(2+3);
        System.out.println(2/3);

        // mod işlemi % ile gösterilir...  7 mod 2 =1

        System.out.println(85%8);

        //increment

        int i=10;
        i++;  // i=i+1;
        ++i;
        System.out.println("i = " + i);

        System.out.println(++i);
        System.out.println(i++);

        System.out.println(i);


        i=25;

        i++;
        System.out.println("i = " + i);

        ++i;
        System.out.println("i = " + i);

        System.out.println("i = " + i++);

        System.out.println("i = " + i);

        //  System.out.println("++i = " + ++i);


        i--;
        --i;

        System.out.println("i = " + i--);

        //sayı değerlerinin toplamını nasıl bulurum  568
        int sayi=813;

        int result=sayi%10;
        System.out.println("result = " + result);
        sayi/=10;  // sayi=sayi/10;
        System.out.println("sayi = " + sayi);
        //98  mod 10  = 8
        result+=sayi%10;  // result=result+sayi%10

        System.out.println("result = " + result);

        sayi/=10;
        result+=sayi%10;   //9 mod 10  = 9   --- result=result+9

        System.out.println("result = " + result);

        i++;
        i+=3;  // i=i+3;


    }
}
