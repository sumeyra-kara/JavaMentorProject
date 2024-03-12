package day37_interface_enum;

public interface Flyable {

    int speed = 100;

    void fly();

    static void staticMethod(){

    };

    default void testDefault(String name){


    }


    //bir class içerisinden bir interface'i kullanmak istersek "implements" keywordünü kullanmak zorundayız
    //interface içerisinden başka bir interfacei kullanma istersek "extends" keywordünü kullanmak zorundayız
    //class içerisinden başka bir classı kullanmak istersek "extends" keywordünü kullanmak zorundayız

}
