package day12_Methods;

public class C03_FactorialMethod {
    public static void main(String[] args) {

       int result= countFactorial(5);


        System.out.println("result = " + result);


        int result_2= countFactorial(8);

        System.out.println("result_2 = " + result_2);

        System.out.println("countFactorial(0) = " + countFactorial(0));



    }

    public static int countFactorial(int number) {

        int foctorial = 1;

        for (int i = 1; i <=number ; i++) {
            foctorial*=i;   //factorial=factorial*i;
        }

        return foctorial;
    }

}
