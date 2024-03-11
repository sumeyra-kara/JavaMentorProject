package day29_accessModifierAndEncapsulation;

public class Test {
    public static void main(String[] args) {



        Araba araba1 = new Araba();

        araba1.setMarka("Toyota");

        System.out.println(araba1.getMarka());

        Araba araba2 = new Araba();
        araba2.setTekilSatis(10000);
        araba2.setTekilSatis(40000);

        araba1.setTekilSatis(20000);
        araba1.setTekilSatis(70000);

        System.out.println(araba1.satisToplami);
        System.out.println(araba2.satisToplami);
    }
}
