package day01_MyFirstJavaProgram;

import day29_accessModifierAndEncapsulation.Araba;

public class MyFirstProgram {

    //myPackage

    //MyClass

    //myMethod   --->my_Method

    //myVariable

    public static void main(String[] args) {

        System.out.print("Hello w\rorld");
        System.out.println("Hello\n wor\tld");
        System.out.println("Hell\bo          world");
        System.out.println("Hello world");
        System.out.println("Hello\\ world");
        System.out.println("\"Hello\" world");

        // \n  -> Yeni Satir
        // \t  -> bir tab bsoluk birakti
        // \b  -> Backspace
        // \"  -> "
        // \r  -> Satir Basi
        // \\  ->  \

        //hata mesajı vermek için
        System.err.println("This is an error");

        Araba araba = new Araba();

    }
}
