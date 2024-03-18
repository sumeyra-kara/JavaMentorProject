package day40_errorAndExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("---------Unchecked Exceptions-------------");

        System.out.println("Test 1 başladı");

        int i = 9;
        int j = 0;

        try {
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            System.out.println("1. catch blok çalıştı");
            System.out.println(j / i);
            System.out.println(e.getMessage());
       //     e.printStackTrace();
        }

        System.out.println("Test 1 tamamlandı");

        System.out.println("Test 2 başladı");

        int [] nums = {58,35,985,32,108};

        try {
            System.out.println(nums[15]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. catch blok çalıştı");
            System.out.println(nums[nums.length-1]);
            System.out.println(e.getMessage());
        //    e.printStackTrace();
        }

        System.out.println("Test 2 tamamlandı");

        System.out.println("Test 3 başladı");

        try {
            System.out.println("Java".substring(2, 0));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("3. catch blok çalıştı");
            System.out.println("Java".substring(0,2));
            System.out.println(e.getMessage());
       //     e.printStackTrace();
        }

        System.out.println("Test 3 tamamlandı");

        System.out.println("---------Checked Exceptions-------------");

        System.out.println("Test 4 başladı");

        try {
            Thread.sleep(-2000);
            Thread.sleep(-3000);
            System.out.println("Try çalıştı");
        } catch (Exception e) {
            System.out.println("4. catch blok çalıştı");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Test 4 tamamlandı");

        System.out.println("Test 5 başladı");


        try {
            FileInputStream file = new FileInputStream("path");
            System.out.println("Try çalıştı");
        } catch (FileNotFoundException e) {
            System.out.println("5. catch blok çalıştı");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Test 5 tamamlandı");


    }
}
