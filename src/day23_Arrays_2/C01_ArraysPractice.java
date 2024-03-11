package day23_Arrays_2;

import java.util.Arrays;



public class C01_ArraysPractice {
    public static void main(String[] args) {
        String [] names ={"Aliş","Veli"};
        String [] names1 ={"Ali","Sema","Hüseyin"};

        System.out.println("names[0] = " + names[0]);
        System.out.println("names1[0] = " + names1[0]);

        System.out.println("ilkElemanKontrol(names1,names) = " + ilkElemanKontrol(names1, names));

        int [] nums = {3,58,21,2,10};

        int[] sonuc = toplaCarp(nums);

        System.out.println("Arrays.toString(sonuc) = " + Arrays.toString(sonuc));
        System.out.println(Arrays.toString(toplaCarp(nums)));

        System.out.println(ArrayYazdirma.yazdirma(nums));


    }
    // bir metod yazın iki array kabull etsin, ilk elemanları eşitse true döndürsün

    public static boolean ilkElemanKontrol (String [] strArr1, String [] strArr2){
        return strArr1[0].equals(strArr2[0]);
    }

    //İnt array ın elemanlarının toplamını ve çarpımını yeni bir array içinde döndüren bir method yazın.
    public static int [] toplaCarp(int [] sayilar){
        int [] resultArr = new int[2];
        int toplam = 0;
        int carpim = 1;
        for (int sayi : sayilar) {
            toplam +=sayi;
            carpim *=sayi;
        }
        resultArr[0] = toplam;
        resultArr[1] =carpim;
        return resultArr;
    }
}
