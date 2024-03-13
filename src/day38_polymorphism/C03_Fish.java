package day38_polymorphism;

public class C03_Fish extends C02_Animals{


    String color = "rengi belli değil";



    void hareket(){
        System.out.println("yüzerler");
    }
    void solunum(){
        System.out.println("solungaç ile yaparlar");
    }

    void yuzgec(){
        System.out.println("yüzgeçleri vardır");
    }

    void water(){
        System.out.println(" suda yaşarlar");
    }

    protected Integer dolasim(int x){
        return 1;
    }
}
