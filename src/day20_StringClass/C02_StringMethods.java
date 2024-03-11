package day20_StringClass;

public class C02_StringMethods {
    public static void main(String[] args) {
        // toLowerCase(), toUpperCase()
        String str = "Arzu";
        //immutable class -- değişmezlik
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str = " + str);
        str = str.toUpperCase();
        System.out.println("str = " + str);


        //mutable class
        StringBuilder stringBuilder = new StringBuilder("Mehmet");
        System.out.println("stringBuilder.reverse() = " + stringBuilder.reverse());
        System.out.println("stringBuilder = " + stringBuilder);

        str = str.toLowerCase();

        System.out.println("str = " + str);


        //charAt();

        String name = "Sadettin";
        //             01234567
        System.out.println("name.charAt(2) = " + name.charAt(2));
        System.out.println("name.charAt(0) = " + name.charAt(0));

        System.out.println("name.length() = " + name.length());

      //  System.out.println("name.charAt(-1) = " + name.charAt(9));  // runtime error

     //   System..println(8/0)   //compile time error

        //concat();
        String a = "Ali";
        String b = "Veli";

        String birlesik = a+b;
        String birlesik1 = a.concat(b);


        System.out.println(a+b);
        System.out.println(a.concat(b));

        System.out.println(birlesik.equals(birlesik1));  // true

        System.out.println(birlesik==birlesik1);  // false

        // trim ()

        String s = "      Ahmet             eve          geldi.          ";
        System.out.println("s.trim() = " + s.trim());
        System.out.println("s = " + s);


    }
}
