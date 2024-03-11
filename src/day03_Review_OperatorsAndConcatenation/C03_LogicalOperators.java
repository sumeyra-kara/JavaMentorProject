package day03_Review_OperatorsAndConcatenation;

public class C03_LogicalOperators {
    public static void main(String[] args) {

        //  & && AND operatörü : true olması için bütün şartların true olması lazım
        System.out.println((2 < 3) & (5 == 5) && (7 > 6));  //true
        System.out.println(!((2 < 3) & (5 == 5) && (7 > 6) & (8 != 8)));  //true

        //  | || OR operatörü : true olması için tek bir şartın true olması yeterlidir

        System.out.println((2 > 3) | (5 == 'f') || (true));  //true
        System.out.println((2 > 3) | (5 == 'f') || (6>=8));  //false

    }
}
