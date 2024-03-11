package day24_Arrays_3_Multi;

import java.util.Arrays;

public class C01_CloneArray {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 65;    //default değeri 0 dır
        arr[2] = 85;
        arr[3] = 50;
        arr[4] = 59;

        int[] cloneArr = arr.clone();

        int[] fakeArr = arr;

        arr[0] = 100;

        System.out.println(Arrays.toString(cloneArr));
        System.out.println(Arrays.toString(arr));


        String str = "Bugün hava çok güzel";
        char[] chars = str.replace(" ", "").toCharArray();

        System.out.println(chars);
        System.out.println("chars = " + chars);
    }
}
