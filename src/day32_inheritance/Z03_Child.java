package day32_inheritance;

public class Z03_Child extends Z02_Parent{

    static {
        System.out.println("3");
    }
    public Z03_Child() {

        System.out.println("Child consturctor");
    }

    public static void main(String[] args) {
        Z03_Child child =  new Z03_Child();
    }
}
