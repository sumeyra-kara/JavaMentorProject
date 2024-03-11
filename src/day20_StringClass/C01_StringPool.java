package day20_StringClass;

import day16_Classes.Car;

public class C01_StringPool {
    public static void main(String[] args) {

        //new keyword ile
        String str =  new String("Mehmet");

        //literal
        String str1 = "Mehmet";
        String str2 = "Mehmet";
        String str3 = "Ahmet";

        String str4 =  new String("mehmet");

        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));
        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));

        str = str.intern();

        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));

        System.out.println(str4 == str1);

        System.out.println(str4.equals(str1));
        System.out.println(str4.equalsIgnoreCase(str1));

    }
}
