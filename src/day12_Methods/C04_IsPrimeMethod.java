package day12_Methods;

public class C04_IsPrimeMethod {

    public static void main(String[] args) {
        System.out.println("isPrime(18) = " + isPrime(18));
        System.out.println("isPrime(23) = " + isPrime(23));

    }

    public static boolean isPrime(int number){

        boolean flag = true;

        for (int i = 2; i <number/2 ; i++) {
            if (number % i ==0){
                flag = false;
             //   break;
               return flag;
            }
        }

        return flag;
    }
}
