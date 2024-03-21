package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C02_MapMethods {
    public static void main(String[] args) {
        //put(key,value)
        Map<Integer,String > hashMap = new HashMap<>();
        hashMap.put(10,"Ali");
        hashMap.put(20,"Veli");
        hashMap.put(30,"Filiz");
        hashMap.put(40,null);
        hashMap.put(50,null);
        hashMap.put(null,"Ahmet");
        hashMap.put(70,"Mehmet");
        System.out.println("hashMap = " + hashMap);
        //get(key)
        System.out.println("hashMap.get(10) = " + hashMap.get(10));

        //replace()
        hashMap.replace(10,"Mustafa");
        System.out.println("hashMap = " + hashMap);
        hashMap.replace(10,"Mustafa","Mustafa Ali");
        System.out.println("hashMap = " + hashMap);

        //remove()
        hashMap.remove(10);
        System.out.println("hashMap = " + hashMap);
        hashMap.remove(70,"Mehmet");
        System.out.println("hashMap = " + hashMap);

        //containsKey()
        System.out.println("hashMap.containsKey(50) = " + hashMap.containsKey(50));
        //containsValue()
        System.out.println("hashMap.containsValue(\"Ahmet\") = " + hashMap.containsValue("Ahmet"));

        //isEmpty()
        System.out.println("hashMap.isEmpty() = " + hashMap.isEmpty()); //false
       // hashMap.clear(); // temizler
        System.out.println("hashMap.isEmpty() = " + hashMap.isEmpty()); //true

        //equals -- iki map birbirine eşit mii diye kontrol eder
        Map<Integer,String > hashMap2 = new HashMap<>();
        hashMap2.put(10,"Ali");
        hashMap2.put(20,"Veli");
        hashMap2.put(30,"Filiz");
        hashMap2.put(40,null);
        hashMap2.put(50,null);

        System.out.println("hashMap.equals(hashMap2) = " + hashMap.equals(hashMap2));

        //keySet
        System.out.println("hashMap.keySet() = " + hashMap.keySet());

        //values
        System.out.println("hashMap.values() = " + hashMap.values());

        //entrySet()
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        System.out.println("entries = " + entries);

        for (Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getValue()+" --> "+entry.getKey());
        }

    }
}
