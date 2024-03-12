package day37_interface_enum;

public class Eagle extends Animal implements Flyable {
    public Eagle(String name, String size, int age, char gender) {
        super(name, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("Eagle");
    }

    @Override
    public void fly() {
        System.out.println(name + " can fly at 80km/h");
    }

}
