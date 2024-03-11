package day03_Review_OperatorsAndConcatenation;

public class C02_StringConcatenation {
    public static void main(String[] args) {
        String s = "Ali";
        String s1 = "Ahmet";

        System.out.println(s + s1);
        System.out.println(s + " " + s1);
        System.out.println(s + " " + s1);

        int i = 20;
        int j = 10;

        System.out.println(s + i + j);  //Ali2010
        System.out.println(i + j + s);  //30Ali

        System.out.println(s + (i + j)); //Ali30

        System.out.println(s + i * j);//Ali200
        System.out.println(s + i / j);//Ali2
        System.out.println(s + i % j);//Ali0

        String s2 = i + j + s;
        System.out.println(s2);  //30Ali

        String s3 = i + j + "";
        System.out.println(s3);  //30   String s3="30";

        System.out.println("---------------------");

        System.out.println("Result A "+0+1);   //Result A 01
        System.out.println("Result B "+(1)+(2));  //Result B 12
        System.out.println("Result C "+(1+2));   //Result C 3
        System.out.println(1+2+"Result D "+(3)+(4+3));  //3Result D 37
        System.out.println("Result E "+3+2*5);  //Result E 310

        //işlem önceliği
        //1- parantez ()
        //2- * / ve mod(%)  soldan sağa
        //3- + - soldan sağa
    }
}
