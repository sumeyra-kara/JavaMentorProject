package day25_WrapperClasses;

public class C01_WrapperClass {
    public static void main(String[] args) {

        int x = 5;

        Integer y = 6;
        System.out.println("y = " + y);

        int i = y.intValue();
        System.out.println("i = " + i);


        int numberP = 10;
        Integer numberW = 20;

        numberP = numberW;  //  auto unboxing
        numberP = numberW.intValue();  // unboxing

        numberW = numberP;  // auto boxing


        System.out.println("Integer.max(35,36) = " + Integer.max(35, 36));
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Double.sum(25.58,26.8) = " + Double.sum(25.58, 26.8));

    }
}
