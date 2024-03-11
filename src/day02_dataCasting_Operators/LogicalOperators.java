package day02_dataCasting_Operators;

public class LogicalOperators {
    public static void main(String[] args) {


        //  >,<,>=,<=, ! , ||  ,  & , ==

        boolean bl = (5<8);

        System.out.println("bl = " + bl);

        System.out.println(5<5);

        System.out.println(5!=8);
        System.out.println(5!=8 && 6>9);
        System.out.println(!(5!=8 || 6>9));
    }
}
