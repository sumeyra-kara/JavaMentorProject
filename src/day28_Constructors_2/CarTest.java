package day28_Constructors_2;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("ToyotaSuper","Corolla","White",2011,true);

        System.out.println("car1 = " + car1);

        System.out.println("car1.idOfCar() = " + car1.idOfCar());

        Car car2 = new Car("Volkswagen","Jetta");

        Car car3 =null;
        car3.idOfCar();
    }
}
