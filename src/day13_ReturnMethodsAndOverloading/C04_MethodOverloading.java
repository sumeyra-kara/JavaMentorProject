package day13_ReturnMethodsAndOverloading;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        System.out.println("sum(2,3) = " + sum(2, 3));
        System.out.println("sum(1.8,.8) = " + sum(1.8, .8));
        System.out.println(sum(2, 3, 52454545.5, 3));
    }
    // same method name, different parameter
    public static int sum(int x, int y){
        int result = (x+y);
        return result;
    }
    public static double sum(double x, double y){
        double result = (x+y);
        return result;
    }

    public static double sum(int x, int y, int z, double d){
        double result = (x+y+z+d);
        return result;
    }

    public static double sum(int x, int y, double d, int z){
        double result = (x+y+z+d);
        return result;
    }

}
