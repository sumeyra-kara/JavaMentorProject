package day38_polymorphism;

public class C01_MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(6, 8, 9));
        int i = 5;

    }

    public static int sum (int x, int y){
        return x+y;
    }

    public static double sum (double x, double y, double z){
        return x+y+z;
    }

    public static double sum (double x, double y, int z){
        return x+y-z;
    }

    public static double sum (double x, int y, int z){
        return x-y-z;
    }
}
