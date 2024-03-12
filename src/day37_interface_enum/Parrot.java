package day37_interface_enum;

public class Parrot extends Animal implements Flyable, Playable {
    public Parrot(String name, String size, int age, char gender) {
        super(name, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Parrot");
    }

    @Override
    public void fly() {
        System.out.println(name + " can fly at 50km/h");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing");
    }
}
