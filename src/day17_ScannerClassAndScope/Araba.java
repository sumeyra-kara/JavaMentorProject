package day17_ScannerClassAndScope;

public class Araba {

    public static String model = "Porche";
    public String renk;
    public int age;
    public int speed;


    public void speed(){
        System.out.println(model+ " hizlaniyor "+ age + " yaş icin sürati : "+speed);
    }

    public static void marka(){
        System.out.println("Buradaki tüm arabalar "+model+"'dir.");
    }
}
