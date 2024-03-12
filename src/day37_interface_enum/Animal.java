package day37_interface_enum;

public abstract class Animal {

    String name;
    String size;
    int age;
    char gender;

    public Animal(String name, String size, int age, char gender) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }

    public abstract void eat();

    public void drink(){
        System.out.println(name + " is drinking water");
    }


    //Interface is blueprint of class
    //Class is blueprint of an object

}
