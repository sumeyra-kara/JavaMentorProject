package day23_Arrays_2;

import java.util.Arrays;

public class C02_ArrayMethods_2 {
    public static void main(String[] args) {
        //clone
        String [] names ={"Ali","Sema","Hüseyin","Bayhan","Mutlu"};
        String[] names_2 = names.clone();

        //değişiklikler fakeclone!a yansır.... names_2'ye yansımız

        String [] fakeClone = names;

        names[0]="Hayriye";

        System.out.println(ArrayYazdirma.yazdirma(names_2));
        System.out.println(Arrays.toString(names_2));

        System.out.println(Arrays.toString(fakeClone));


        String[] altBolum = Arrays.copyOfRange(names, 1, 4);

        System.out.println(Arrays.toString(altBolum));

        //sort -sıralama -- küçükten büyüğe

        names[0]=names[0].toLowerCase();
        System.out.println(names[0]);

        int [] nums = {11,23,25,36,5};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(names);
        System.out.println(ArrayYazdirma.yazdirma(names));

        String [] numsStr = {"11","23","25","9","36","5"};
        Arrays.sort(numsStr);
        System.out.println(ArrayYazdirma.yazdirma(numsStr));

        //fill
        Arrays.fill(numsStr,1,4,"009");
        System.out.println(ArrayYazdirma.yazdirma(numsStr));

        Arrays.fill(numsStr,"UMUT");
        System.out.println(ArrayYazdirma.yazdirma(numsStr));

        Arrays.fill(numsStr,"UMUT");
        System.out.println(ArrayYazdirma.yazdirma(numsStr));


        System.out.println(numsStr[1]);
        String[] split = numsStr[1].split("");
        System.out.println(Arrays.toString(split));
    }
}
