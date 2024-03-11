package day07_ForLoops;

public class C03_ForLoop_3 {
    public static void main(String[] args) {
        // 1-100 'e kadar olan sayıların tolamını alalım
        int sum=0;

        for ( int i = 1; i <=100 ; i++) {
            sum+=i;
        }

        System.out.println("sum = " + sum);

        // 8 faktöryel kaça eşittir..
        int factoryel=1;
        int num=8;

        for (int i = 1; i <=num ; i++) {
            factoryel*=i;
        }

        System.out.println(num+"! = "+factoryel);

    }
}
