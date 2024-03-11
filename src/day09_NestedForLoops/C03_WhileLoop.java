package day09_NestedForLoops;

public class C03_WhileLoop {
    public static void main(String[] args) {

        int i =5;

        while (i<=10){
            System.out.println("Hello");
            i++;
        }

        boolean bl = true;

        while (bl){
            System.out.println("Dunya");
            i++;
            if (i==15){
              break;
            }
        }
    }
}
