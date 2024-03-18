package day40_errorAndExceptions;

public class C05_DisadvantagesOfThrows {
    public static void main(String[] args)  {

        System.out.println("test başladı");
        //sleep_1(3);
        sleep_2(2.8);
        System.out.println("test bitti");

    }

    public static void sleep_1(double seconds) throws InterruptedException {
        Thread.sleep((long) (seconds*1000));
    }

    public static void sleep_2(double seconds)  {
        try {
            Thread.sleep((long) (seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
