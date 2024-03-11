package day17_ScannerClassAndScope;

public class TestAraba {
    public static void main(String[] args) {


       Araba.model = "Opel";

        Araba araba1 = new Araba();


        araba1.age = 10;
        araba1.speed = 200;

        araba1.speed();

        araba1.age=12;

        araba1.speed();

        Araba araba2 = new Araba();

     //   araba2.model = "Toyota";
        araba2.age = 3;
        araba2.speed = 240;

        araba2.speed();

        Araba.marka();

        araba2.marka();


        for ( int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        if (true){
            int k=10;
            System.out.println("k = " + k);
        }

        System.out.println("araba1.speed = " + araba1.speed);
        System.out.println("araba1.renk = " + araba1.renk);




    }
}
