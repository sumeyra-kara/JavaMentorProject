package day25_WrapperClasses;

public class C01_VarArgs {
    public static void main(String[] args) {
        System.out.println("sum(3,5,6,15) = " + sum(3, 5, 6, 15));
        System.out.println("sum(3,9) = " + sum(3, 9));

        concatWithPlus("Hamza","Sacide","Zuhal","Hasan");

        String [] names = {"Mualla","Necla","Zafer","Buket"};

        concatWithPlus(names);

        String str = "Ahmet";


    }

    public static int sum(int...numbers){
        System.out.println("numbers.length = " + numbers.length);
        int result = 0;
        for(int number : numbers){
            result+= number;
        }
        return result;
    }

    public static void concatWithPlus(String...words){
        String str = String.join("+",words);
        System.out.println(str);
    }
}
