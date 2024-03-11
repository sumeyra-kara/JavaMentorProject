package day32_inheritance;

public class Poultry extends Birds{
    String color ="Undefined";

    String gender = "Undefined";



    void hareket( )  {
        System.out.println("yürürler");
    }

    void beslenme( )  {
        System.out.println("et ve ot yerler");
    }
}
