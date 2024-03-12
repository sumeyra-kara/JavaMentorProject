package day37_interface_enum;

public class Dog extends Animal implements Playable{
    public Dog(String name, String size, int age, char gender) {
        super(name, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Dog");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing");
    }
}
