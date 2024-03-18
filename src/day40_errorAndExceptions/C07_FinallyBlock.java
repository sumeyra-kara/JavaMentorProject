package day40_errorAndExceptions;

public class C07_FinallyBlock {
    public static void main(String[] args) {

        System.out.println("Test Başladı");

        String [] names = {"Ali","Oya","Jale"};

        try {
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Test Bitmelidir");
        }

        System.out.println("Test Bitti");
    }
}
