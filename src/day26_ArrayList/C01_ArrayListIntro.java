package day26_ArrayList;

import java.util.*;

public class C01_ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        //add()
        nameList.add("Serap");
        nameList.add("Mahmut");
        nameList.add("Cavit");
        nameList.add("Ece");
        nameList.add("Şebnem");
        nameList.add("Fuat");
        nameList.add("Suat");
        nameList.add("Murat");
        nameList.add("Esat");
        nameList.add("Cavit");

        ArrayList<String> subNames = new ArrayList<>();
        subNames.add("Suat");
        subNames.add("Murat");
        subNames.add("Esat");

        System.out.println("nameList = " + nameList);

        nameList.add(1, "Esin");


        //set(index , value)
        nameList.set(0, "Meral");

        //size()
        System.out.println("nameList.size() = " + nameList.size());

        //get(index)
        System.out.println("nameList.get(3) = " + nameList.get(3));
        System.out.println("nameList = " + nameList);
        //remove (index)
        System.out.println("nameList.remove(2) = " + nameList.remove(2));

        System.out.println("nameList.remove(\"Mahmut\") = " + nameList.remove("Mahmut"));
        System.out.println("nameList.remove(\"Esin\") = " + nameList.remove("Esin"));

        //removeAll()
        System.out.println("nameList.removeAll(subNames) = " + nameList.removeAll(subNames));

        //clear()
        // nameList.clear();

        //indexOf
        System.out.println("nameList.indexOf(\"Cavit\") = " + nameList.indexOf("Cavit"));

        //lastIndexOf
        System.out.println("nameList.lastIndexOf(\"Cavit\") = " + nameList.lastIndexOf("Cavit"));



        //contains()
        System.out.println("nameList.contains(\"Cavit\") = " + nameList.contains("Cavit"));
        System.out.println("nameList = " + nameList);

        //remove
        String s = "Cavit";
    //    nameList.remove(s);
       // nameList.remove("Cavit");

        //nameList.removeIf(e->e.equals(s));
        nameList.removeIf(e->e.length()>3);

        System.out.println("\"--------------\" = " + "--------------");

        System.out.println("nameList = " + nameList);

        //equals()
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 5, 84));
        ArrayList<Integer> nums_2 = new ArrayList<>(Arrays.asList(2, 3, 5, 84));

        System.out.println("nums.equals(nums_2) = " + nums.equals(nums_2));

        Collections.sort(nums);
        Collections.sort(nums_2);

        System.out.println("nums.equals(nums_2) = " + nums.equals(nums_2));

        ArrayList<Integer> nums_3 = new ArrayList<>(Arrays.asList(1173, 113, 512, 22, 2121, 84, 20, 22, 8));

        System.out.println("sortMethod(nums_3) = " + sortMethod(nums_3));

        System.out.println("sum(nums_3) = " + sum(nums_3));
        System.out.println("sum_1(nums_3) = " + sum_1(nums_3));

    }

    // girilen array listi sıralayan metodu yazalım
    public static ArrayList<Integer> sortMethod(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    Integer temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }

        return arrayList;
    }

    public static int sum (ArrayList<Integer> numbers){
        int result = 0;
        for (Integer number : numbers) {
            result += number;
        }

        return result;
    }

    public static int sum_1 (ArrayList<Integer> numbers){
        int result = 0;
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
        }

        return result;
    }

}
