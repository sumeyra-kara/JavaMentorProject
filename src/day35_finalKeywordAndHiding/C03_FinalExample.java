package day35_finalKeywordAndHiding;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_FinalExample {

    public static void main(String[] args) {

        final String NAME = "Mustafa";

     //   NAME = "Ali"; // hata verir.. çünkü final değişkenin değeri değişemez...

        final String [] NAMES = {"Havva","Cemile","Nazmi","Özgür"};

        System.out.println(Arrays.toString(NAMES));

        NAMES[1] = "Melike";  // arrayin içindeki değerler değişebilir ama referans değişemez..

        System.out.println(Arrays.toString(NAMES));

        final String [] NAMES1 = {"Havva","Fuat","Nazmi","Özgür"};

        // NAMES = NAMES1;  referans ataması yapıldığından FİNAL devreye girer değişime izin vermez.

        //ArrayListlerde de durum array gibidir.

        final ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,8,4,11,6));


        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2);
        }

        System.out.println("list = " + list);

        int index = 0;
        for (int number : list){
            list.set(index,number*2);
            index++;
        }

        System.out.println("list = " + list);

        list.replaceAll(elem -> elem*2);

        System.out.println("list = " + list);

        list.removeIf(element -> element % 16 == 0);

        System.out.println("list = " + list);
    }
}
