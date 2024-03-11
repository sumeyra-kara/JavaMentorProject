package day28_Constructors_2;

import java.util.Arrays;

public class C_01_PassByValue {
    public static void main(String[] args) {

        double fiyat = 200;

        indirim10 (fiyat);

        System.out.println("Method çağırıldıktan sonra");

        System.out.println("fiyat = " + fiyat);

        System.out.println("2.method return değeri : "+indirim10_2(fiyat));

        System.out.println("2. Method çağırıldıktan sonra");

    //    fiyat= indirim10_2(fiyat);

        System.out.println("fiyat = " + fiyat);


        int [] numbers = {3,4,5};
        System.out.println(Arrays.toString(numbers));

        arttirma(numbers,10);

        System.out.println(Arrays.toString(numbers));

        System.out.println("numbers = " + numbers);
    }
    public static void indirim10(double fiyat){
        fiyat = fiyat * 0.9;
        System.out.println("fiyat netot içi = " + fiyat);
    }

    public static double indirim10_2(double fiyat){
        fiyat = fiyat * 0.9;
        return fiyat;
    }

    public static void arttirma(int [] numbers, int artis){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]+=artis;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("numbers = " + numbers);
    }
}
