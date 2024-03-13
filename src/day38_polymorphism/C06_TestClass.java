package day38_polymorphism;

import day32_inheritance.Animals;

public class C06_TestClass {
    public static void main(String[] args) {

        C04_RiverFish riverFish = new C04_RiverFish();

        System.out.println(riverFish.color); //rengi belli değil
        System.out.println(riverFish.name); // River Fish
        System.out.println(riverFish.gender); // Belirtilmemiş
        System.out.println("----------------");
        riverFish.hareket(); // yüzerler
        riverFish.beslenme(); // ot ile
        riverFish.solunum(); // solungaç
        riverFish.water();  // tatlı su
        riverFish.yuzgec(); // yüzgeçleri vardır

        //eğer istersen child classtan ürettiğin
        //objeyi parent class (abstarct class / interface)
        //data tipi ile tanımlayabilirsin.
        System.out.println("----------------");
        C03_Fish fish = new C04_RiverFish();

        System.out.println(fish.color); //rengi belli değil
        System.out.println(fish.gender); //Belirtilmemiş
        System.out.println(fish.name); // Animals
       // fish.type  CTE
        System.out.println("----------------");
        fish.hareket(); //yüzerler
        fish.solunum();  //solungaç
        fish.yuzgec(); // yüzgeçleri var
        fish.beslenme(); //ot ile beslenirler
        fish.water(); //tatlı
        //fish.kilcik();  //CTE

        System.out.println("----------------");

        System.out.println((fish instanceof C03_Fish)); // true
        System.out.println((fish instanceof C04_RiverFish)); // true
        System.out.println((fish instanceof C02_Animals)); // true
        System.out.println((fish instanceof C05_SeaFish)); // false

        Integer i = 25;

        System.out.println((i instanceof Integer));

        String str = "Ahmet";

        System.out.println("----------------");
        System.out.println(fish.getClass());
        System.out.println(fish.getClass().getSimpleName());
        System.out.println(fish.getClass().getName());
        System.out.println(i.getClass().getSimpleName());

        System.out.println("----------------");
        System.out.println(fish.getClass().getConstructors().length);
        System.out.println(i.getClass().getConstructors().length);
        System.out.println(str.getClass().getConstructors().length);

       // C04_RiverFish rf = new C03_Fish();  CTE
        //down casting

        C02_Animals animal = new C03_Fish();
        System.out.println(animal.color); //null

        C03_Fish fish1 = (C03_Fish) animal;
        System.out.println(fish1.color); // rengi belli değil


        C02_Animals animal1 = riverFish;
    }
}
