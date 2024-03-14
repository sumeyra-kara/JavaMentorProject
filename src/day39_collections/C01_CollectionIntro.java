package day39_collections;

import day38_polymorphism.C02_Animals;

import java.util.*;

public class C01_CollectionIntro {
    public static void main(String[] args) {

        Object [] objects = new Object[5];
        objects[0] = "Ali";
        objects[1] = 5;
        objects[2] = new Scanner(System.in);
        objects[3] = new C02_Animals();
        objects[4] = false;

        System.out.println(objects.length);

        String str;

        /**
         * **Collections
         * List
         * Queue
         * Set
         */

        ArrayList<Integer> arrayList = new ArrayList();

        List<String> list = new ArrayList<>();
        List<Integer> list1 = new Stack<>();
        list1.add(1);
        Stack<Integer> list2 = new Stack<>();


        list2.add(2);
        list2.push(33);
        list2.pop();
        System.out.println(list2);

        ((Vector)list1).elementAt(0);

        System.out.println(list1);

        List<String> letters = new LinkedList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("C");
        letters.add("C");
        letters.add("C");
        letters.add("D");
        letters.add("D");
        letters.add("F");



        System.out.println("letters.indexOf(\"D\") = " + letters.indexOf("D"));
        System.out.println("letters.lastIndexOf(\"D\") = " + letters.lastIndexOf("D"));

        letters.set(letters.size()-1,"K");
        letters.add("K");
        System.out.println(letters);

        List<String> list3 = new ArrayList<>(Arrays.asList("G","F"));
        list3.addAll(Arrays.asList("K","V","S"));

        String [] names = {"Ali","Veli"};


        List<String> list4 = new ArrayList<>();

        System.out.println("letters = " + letters);
        System.out.println("list3 = " + list3);

        letters.addAll(list3);

        System.out.println("letters = " + letters);

        letters.set(2,"W");

        System.out.println("letters = " + letters);

        System.out.println("letters.contains(\"W\") = " + letters.contains("W"));
        System.out.println("letters.containsAll(list3) = " + letters.containsAll(list3));
    }
}
