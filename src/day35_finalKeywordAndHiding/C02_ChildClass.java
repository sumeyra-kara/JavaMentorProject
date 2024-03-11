package day35_finalKeywordAndHiding;

public class C02_ChildClass extends C01_FinalKeyword{

    protected void yazdir1 (String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        C02_ChildClass childClass = new C02_ChildClass();

        childClass.yazdir("ss");
    }

}
