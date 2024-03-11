package day35_finalKeywordAndHiding;

public class C06_C extends C05_B{

    public static void main(String[] args) {
        C06_C obj = new C06_C();

        System.out.println("obj.a = " + obj.a);
        System.out.println("obj.b = " + obj.b);

       obj.sum();

       C04_A.sum();
    }
}
