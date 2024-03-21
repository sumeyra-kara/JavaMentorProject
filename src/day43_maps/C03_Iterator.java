package day43_maps;

import java.util.*;

public class C03_Iterator {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("USA", "Russia", "Germany", "UK", "Turkiye");

        Iterator<String> iterator = countries.iterator();
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.next() = " + iterator.next());
        iterator.next();
        iterator.next();
        System.out.println("iterator.next() = " + iterator.next());
        // iterator.next(); hata fırlatır

        System.out.println("iterator.hasNext() = " + iterator.hasNext());

        List<String> ulkeler = Arrays.asList("USA", "Russia", "Germany", "UK", "Turkiye");

        Iterator<String> iterator1 = ulkeler.iterator();

        ulkeler.listIterator();// ileri geri gider next() previous()

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next() + "--");
        }
        System.out.println("---------------------------");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Ali");
        hashMap.put(20, "Veli");
        hashMap.put(30, "Filiz");
        hashMap.put(40, null);
        hashMap.put(50, null);
        //  hashMap.put(null,"Ahmet");  //iterator ile sorun çıkarabilir
        hashMap.put(70, "Mehmet");

        hashMap.forEach((k, v) -> System.out.println(v + "--->" + k));
        System.out.println("---------------------------");

        Iterator<Integer> iterator2 = hashMap.keySet().iterator();

        while (iterator2.hasNext()) {
            Integer n = iterator2.next();
            System.out.println(n + "---->" + hashMap.get(n));
        }
        System.out.println("---------------------------");

        //    System.out.println("iterator2.hasNext() = " + iterator2.hasNext());

        Map<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(10, "Ali");
        hashMap2.put(20, "Veli");
        hashMap2.put(30, "Filiz");
        hashMap2.put(40, null);
        hashMap2.put(70, "Mehmet");

        Iterator<Integer> iterator3 = hashMap2.keySet().iterator();
        Iterator<String> iterator4 = hashMap2.values().iterator();

        while (iterator3.hasNext()) {
            System.out.println(iterator3.next() + " : " + iterator4.next());
        }

    }
}
