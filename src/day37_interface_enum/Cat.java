package day37_interface_enum;

public class Cat extends Animal implements Playable{
    public Cat(String name, String size, int age, char gender) {
        super(name, size, age, gender);
    }



    @Override
    public void eat() {
        System.out.println("Cat");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing");
    }
}
