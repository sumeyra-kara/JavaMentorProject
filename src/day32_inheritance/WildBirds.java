package day32_inheritance;

public class WildBirds extends Birds{
    String color ;
    String gender = "Undefined";
    String breed = "Not defined";
    void hareket( )  {
        System.out.println("uçarlar");
    }
    void beslenme( )  {
        System.out.println("et yerler");
    }
    void gaga( )  {
        System.out.println("sivri gagalıdır");
    }
    void pence( )  {
        System.out.println("pençeleri vardır.");
    }
    void print(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.gaga();
    }
}
