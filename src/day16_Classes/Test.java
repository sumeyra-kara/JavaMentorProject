package day16_Classes;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.marka="Toyota";
        car1.model="Corolla";
        car1.renk="Beyaz";
        car1.yas=3;
        car1.elektrikliMi=false;

        car1.calistir();
        car1.hizlan();
        car1.dur();
        System.out.println("---------------");

        Car car2= new Car();
        car2.marka="Opel";
        car2.model="Astra";
        car2.yas=8;
        car2.elektrikliMi=true;

        car2.calistir();
        car2.hizlan();
        car2.dur();

        System.out.println(car1.marka);
        System.out.println(car2.marka);

        System.out.println("car1 = " + car1);


        System.out.println("--------------------");

        Circle circle1= new Circle();
        circle1.r=6;

        Circle circle2 = new Circle();
        circle2.r=8;

        double area1 = circle1.area();
        double area2 = circle2.area();

        System.out.println("area1 = " + area1);
        System.out.println("area2 = " + area2);

        System.out.println("circle1.area() = " + circle1.area());

        Circle circle3 = new Circle();
        circle3.r=10;
        System.out.println("circle3.area() = " + circle3.area());

        String str =  "Adnan";

        System.out.println("str = " + str);

    }
}
