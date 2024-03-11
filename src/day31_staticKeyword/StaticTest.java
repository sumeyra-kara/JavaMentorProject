package day31_staticKeyword;

public class StaticTest {
    public static void main(String[] args) throws ClassNotFoundException {

      C01_Static.printStatic();
        Class.forName("day31_staticKeyword.C01_Static");

        C01_Static obj1 = new C01_Static();

        C01_Static obj2 = new C01_Static();
        C01_Static obj3 = new C01_Static();

        System.out.println(obj1.x+ " : "+obj1.y);

        System.out.println(obj2.x+ " : "+obj2.y);

        obj1.y = "Zzzz";
        obj2.y = "Aaaa";

        obj1.x = "Pppp";
        obj2.x = "Tttt";
        C01_Static.x ="Bbbb";

        System.out.println(obj1.x+ " : "+obj1.y);

        System.out.println(obj2.x+ " : "+obj2.y);

        obj1.printInstance();

        C01_Static.printStatic();




    }

}
