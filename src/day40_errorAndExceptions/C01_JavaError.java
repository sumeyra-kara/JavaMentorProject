package day40_errorAndExceptions;

public class C01_JavaError {
    public static void main(String[] args) {
        check(-10);
    }

    public static void check(int i){
        if (i == 0){
            System.out.println("İşlem Tamam");
            return;
        }else {
            System.out.println(i);
            i++;
            check(i);
        }
    }
}
// Java'da errorlar try-catch ile çözülemez.. Kodu değiştirmek gerekir.
// Java errorlerde compile zamanı hata vermez.. (Unchecked)