package day40_errorAndExceptions;

import day36_abstraction.DinarLisesi;

import java.io.FileInputStream;

public class C02_Checked_Unchecked {
    public static void main(String[] args)  {
        System.out.println("---------------Unchecked Exceptions------------");

        int i = 15;
        int j = 0;

       //  System.out.println(i/j); //Exception in thread "main" java.lang.ArithmeticException: / by zero

        int [] array = {2,6,98,36};

       // System.out.println(array[10]); //Exception in thread "main" jArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4

        String str = null;

     //   System.out.println(str.length()); //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null

        DinarLisesi lise = null;
    //   System.out.println(lise.yemekListesi()); //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "day36_abstraction.DinarLisesi.yemekListesi()" because "lise" is null

        System.out.println("---------Checked Exceptions-----------");

       //Thread.sleep(4000);

     //   FileInputStream file = new FileInputStream("path");



    }
}
