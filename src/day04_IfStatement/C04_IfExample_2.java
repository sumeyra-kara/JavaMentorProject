package day04_IfStatement;

public class C04_IfExample_2 {
    public static void main(String[] args) {
          /*
        hava sıcaklığı isminde bir değişken declare edin ve değer atayın
        sıcaklık 20 derece üzerinde ise hava sıcak yazsın
        sıcaklık 20 derece ve altında ise hava soğuk yazsın
         */

        int havaSicakligi=15;


        if (havaSicakligi>20){
            System.out.println("Hava Sıcak");
        }else {
            System.out.println("Hava Soğuk");
        }


        //second way  ama çok tercih edilmeyen  // not eğer if ya da else den sonra tek satır kod yazılacaksa
                                                // body {} parantezleri kullanılmayabilir...
        if (havaSicakligi>20)
            System.out.println("Hava Sıcak");
        if (havaSicakligi<=20)
            System.out.println("Hava Soğuk");
    }
}
