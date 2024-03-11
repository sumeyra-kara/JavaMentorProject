package day33_inheritance_2;

public class _4_WildBirds extends _2_Birds {
    String a = "Wild Birds";
    String b = "";
    String d;
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
        System.out.println(this.a);
        System.out.println(super.a);
        super.gaga();
    }
}
