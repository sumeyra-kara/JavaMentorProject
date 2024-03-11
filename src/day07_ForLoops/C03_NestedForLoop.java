package day07_ForLoops;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello World");
            }
            System.out.println("Merhaba Dünya");
        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

        int x=10;
        int z =11;
        for (int i = 100; i >0 ; i--) {
            System.out.println(x-=2);  // x=x-2;
            System.out.println(i);
            System.out.println("z = " + z);
        }

        int k=0;
        int toplam=0;
        int toplam1=0;
        for (int i = 0; i < 20; i++) {
            toplam+=k;
            toplam1+=i;
            k++;
        }


        System.out.println("toplam1 = " + toplam1);
        System.out.println("toplam = " + toplam);
    }
}
