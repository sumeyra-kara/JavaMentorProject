package day06_TernaryAndSwitch;

public class C02_NestedTernary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tamsayi alin.
        Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        uygun olani yazdirin

        */

        int sayi = -245;

        System.out.println(sayi > 0
                ? sayi % 2 == 0 ? "Pozitif çift sayıdır." : "Pozitif tek sayıdır."
                : sayi > -1000 && sayi < -99 ? "Negatif üç basamaklıdır" : "Negatif üç basamaklı değildir.");

        //verilen birbirinden farklı üç sayının en büyüğünü bir değişkene atayıp yazdırın..
        int x = 1000, y = 200, z = 30;

        int max = x > y && x > z
                ? x
                : y > z ? y : z;

        System.out.println("max = " + max);

    }
}
