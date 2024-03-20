package day41_javaExirce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_RemoveEvenLength {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Ali","Veli","Fatma","Asuman","Hale","Ece"));

        System.out.println(removeEvenLength(list));
        System.out.println(removeEvenLength_1(list));
        System.out.println(removeEvenLength_2(list));
        System.out.println(removeEvenLength_3(list));
    }
    /**
     * Write a method removeEvenLength that takes an ArrayList of Strings as a parameter
     * and that removes all of the strings of even length from the list.
     */

    public static List<String > removeEvenLength(List<String> list){
            List<String> resultList = new ArrayList<>();

        for (String str : list){
            if (str.length() % 2 !=0){
                resultList.add(str);
            }
        }
        return resultList;
    }

    public static List<String > removeEvenLength_1(List<String> list){

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).length() % 2) == 0){
                list.set(i,"");
            }
        }

        list.removeIf(element -> element.equals(""));

        return list;
    }


    public static List<String > removeEvenLength_2(List<String> list){
        List<String> removeList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).length() % 2) == 0){
                removeList.add(list.get(i));
            }
        }
       list.removeAll(removeList);

        return list;
    }

    public static List<String > removeEvenLength_3(List<String> list){
        List<String> removeList = new ArrayList<>();
        for (String s : list){
            if (s.length() % 2 == 0){
                removeList.add(s);
            }
        }
        list.removeAll(removeList);
        return list;
    }
}
