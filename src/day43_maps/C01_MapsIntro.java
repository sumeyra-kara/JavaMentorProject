package day43_maps;

import java.util.*;

public class C01_MapsIntro {
    public static void main(String[] args) {
        /**
         * Maps :
         * collectionların içinde yer almaz ama aynı özelliklere sahiptir
         * primitive data türünü desteklemez.
         * boyutu dinamiktir.
         * key ve value.lardan oluşur.
         * key.ler eşsiz(unique) olmalıdır. value.lar unique olmayabilir.
         *
         * HashMap
         * rastgele sıralama
         * key bir tane null kabul eder ve value.da istediğiniz kadar null olabilir.
         */

        Map<Integer,String > hashMap = new HashMap<>();
        hashMap.put(10,"Ali");
        hashMap.put(20,"Veli");
        hashMap.put(30,"Filiz");
        hashMap.put(40,null);
        hashMap.put(50,null);
        hashMap.put(null,"Ahmet");
        hashMap.put(70,"Mehmet");

        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap = " + hashMap);

        /**
         * LinkedHashMap
         * giriş sırasını korur.
         * key bir tane null kabul eder ve value.da istediğiniz kadar null olabilir.
         */

        Map<Integer,String > linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,"Ali");
        linkedHashMap.put(20,"Veli");
        linkedHashMap.put(30,"Filiz");
        linkedHashMap.put(40,null);
        linkedHashMap.put(null,"Ahmet");
        linkedHashMap.put(null,null);
        linkedHashMap.put(70,"Mehmet");

        System.out.println("linkedHashMap.size() = " + linkedHashMap.size());
        System.out.println("linkedHashMap = " + linkedHashMap);


        /**
         * TreeMap
         * keylere göre sıralar.
         * key null kabul etmez ve value.da istediğiniz kadar null olabilir.
         */

        Map<Integer,String > treeMap = new TreeMap<>();
        treeMap.put(10,"Ali");
        treeMap.put(70,"Mehmet");
        treeMap.put(30,"Filiz");
        treeMap.put(40,null);
//        treeMap.put(null,"Ahmet");
//        treeMap.put(null,null);  exception fırlatır..
        treeMap.put(20,"Veli");

        System.out.println("treeMap.size() = " + treeMap.size());
        System.out.println("treeMap = " + treeMap);

        /**
         * HashTable
         * rastgele sıralar
         * key null olamaz, value null olamaz
         * Thread safe
         */

        Map<Integer,String > hashTable = new Hashtable<>();
        hashTable.put(10,"Ali");
        hashTable.put(70,"Mehmet");
        hashTable.put(33,"Filiz");
        hashTable.put(40,"Evren");

        System.out.println("hashTable.size() = " + hashTable.size());
        System.out.println("hashTable = " + hashTable);
    }
}
