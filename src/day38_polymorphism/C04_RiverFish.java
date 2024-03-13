package day38_polymorphism;

public class C04_RiverFish extends C03_Fish{

    String name = "River Fish";

    String type;



    void kilcik(){
        System.out.println("çok kılçıklı olurlar");
    }
    void water(){
        System.out.println("Tatlı suda yaşarlar");
    }

    void beslenme(){
        System.out.println("ot ile beslenirler");
    }
}
