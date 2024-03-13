package day38_polymorphism;

public class C02_Animals {

    String name = "Animals";

    String color;

    String gender = "Belirtilmemiş";

    void hareket(){
        System.out.println("hareket ederler");
    }

    void solunum(){
        System.out.println("nefes alırlar");
    }

    void beslenme (){
        System.out.println("beslenirler");
    }

    protected Number dolasim(int i){
        return 0;
    }
}
