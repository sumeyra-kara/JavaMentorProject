package day22_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[4] = 5;
        numbers[3] = 8;
        numbers[2] = 18;
        numbers[0] = 78;
        numbers[1] = 89;

        System.out.println("numbers[2] = " + numbers[2]);

        System.out.println("numbers = " + numbers);

        //arrayin boyu
        int z = numbers.length;
        String isim = "Adem";
        int j = isim.length();


        //arrayler iki türlü yazdırılır
        //for loop ile
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // for each loop  // index olmaz
        for (int num : numbers) {
            System.out.println(num);
        }

        String names [] = {"Ayşe", "Fatma", "Orkun", "Tolga","Buğra"};
        names[3] = "Meral";
        //    names[5] = "Ersin";  //runtime error

        //Arrays.toString();

        System.out.println(Arrays.toString(names));

        String namesStr = Arrays.toString(names);
        System.out.println("namesStr.charAt(0) = " + namesStr.charAt(0)); // [

        //for each ile isimleri yazdıralım
        //Orkun'a gelince ismini yazmasın onun yerine Orkun burda yazsın ve
        //daha sonrakilerin ismini yazmasın

        for (String name : names) {

            if (name.equals("Orkun")){
                System.out.println("Orkun burda");
                break;
            }
            System.out.println(name);
        }

        System.out.println("arraySum(numbers) = " + arraySum(numbers));

       String [] students = namesToArray("elif","umut","ipek");
        System.out.println("students = " + students);
        System.out.println("Arrays.toString(students) = " + Arrays.toString(students));

    }

    public static int arraySum(int [] arrInt){
        int result = 0;
        for (int a : arrInt) {
            result += a;
        }
        return result;
    }

    public static String [] namesToArray (String name1, String name2, String name3){
       // String [] resultArr = {name1,name2,name3};  böyle de olur
         String [] resultArr = new String[3];
        resultArr[0] = name1;
        resultArr[1] = name2;
        resultArr[2] = name3;

        return resultArr;
    }
}
