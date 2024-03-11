package day29_accessModifierAndEncapsulation;


public class Employee {

    public static String factoryName = "ABV Machine";
    private String name;
    private String  surname;
    int age;
    protected String branch;

    public String className;

    public void printName(){
        System.out.println(name);
        System.out.println(age);
    }

}
