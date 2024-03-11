package day28_Constructors_2;

public class Car {

    String brand;
    String model;
    String color;
    int productionDate;
    boolean isSecondhand;

    Car(){
        System.out.println("Araba kaydı alındı");

    }

    public Car(String brand) {
        this();
        this.brand = brand;
        if (this.brand.length()>8){
            this.brand = brand.substring(0,5);
        }
    }

    public Car(String brand, String model) {
        this();
        this.brand = brand;
        this.model = model;
        if (this.brand.length()>8){
            this.brand = brand.substring(0,5);
        }

    }

    public Car(String brand, String model, String color, int productionDate, boolean isSecondhand) {
        this();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionDate = productionDate;
        this.isSecondhand = isSecondhand;
        if (this.brand.length()>8){
            this.brand = brand.substring(0,5);
        }

    }

    String idOfCar(){
        return brand.substring(0,3)+model.substring(0,3)+color+(2024-productionDate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionDate=" + productionDate +
                ", isSecondhand=" + isSecondhand +
                '}';
    }
}
