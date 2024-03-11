package day33_inheritance_2;

public class TestClass {
    public static void main(String[] args) {

        _1_Animals animal = new _1_Animals();
        _2_Birds bird = new _2_Birds();
        _3_Poultry poultry = new _3_Poultry();
        _4_WildBirds wildBird = new _4_WildBirds();

        System.out.println(wildBird.c);

        System.out.println("animal.a = " + animal.a);
        System.out.println("bird.a = " + bird.a);
        System.out.println("poultry.a = " + poultry.a);
        System.out.println("poultry.b = " + poultry.b);
        System.out.println("poultry.c = " + poultry.c);



        wildBird.solunum();

        System.out.println("----------");

        _2_Birds bird2 = new _4_WildBirds();

        System.out.println("bird2.a = " + bird2.a);
        bird2.hareket();

        _1_Animals animal1 = new _2_Birds();
        animal1.hareket();

        bird2.beslenme();

        String str = "Ahmet";

        System.out.println(str instanceof String);

        System.out.println("---------------------");

        System.out.println(bird2 instanceof _4_WildBirds);
        System.out.println(bird2 instanceof _2_Birds);

     //  _2_Birds bird3 = new _1_Animals();  CTE



    }
}
