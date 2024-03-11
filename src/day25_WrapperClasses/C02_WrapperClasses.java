package day25_WrapperClasses;

public class C02_WrapperClasses {
    public static void main(String[] args) {
        String str = "123";
       // System.out.println(str*3);

        Integer integer = Integer.valueOf(str);//Integer
        int i = Integer.parseInt(str);//int

        System.out.println(integer*3);
        System.out.println(i*3);

        String str2 ="false";
        boolean b = Boolean.parseBoolean(str2);
        System.out.println("b = " + b);


        Byte z = 3;


        String s = "Hava sıcaklığı 10 derecedir.";
        // hava sıcaklığı 15 derece arttı. yazıyı düzeltin ve yazdırın...

        String [] words = s.split(" ");
        Integer newInteger=Integer.valueOf(words[2])+15;

        System.out.println("Hava sıcaklığı "+newInteger+" derecedir.");

    }
}
