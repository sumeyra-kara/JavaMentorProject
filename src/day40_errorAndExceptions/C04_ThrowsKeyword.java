package day40_errorAndExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_ThrowsKeyword {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        System.out.println( "Test Başladı");
        Thread.sleep(2000);
        FileInputStream file = new FileInputStream("C:\\Users\\ihsan\\OneDrive\\Masaüstü\\sss.txt");
        Thread.sleep(2000);
        System.out.println("Test Bitti");
    }
}
