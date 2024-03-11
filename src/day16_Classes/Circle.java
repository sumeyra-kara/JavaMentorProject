package day16_Classes;

 public class Circle {
    //daire alan ve çevre hesaplayan metodları olacak
    // buna göre fields tanımlaması yapalım ve metodları yazalım.

    public double r;
    final public double PI = Math.PI;

    public double area(){
        return r*r*PI;
    }

    public double perimeter(){
        return 2*PI*r;
    }
}
