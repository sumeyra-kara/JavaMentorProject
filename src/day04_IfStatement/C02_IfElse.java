package day04_IfStatement;

public class C02_IfElse {
    public static void main(String[] args) {

        int x = 6;

        boolean bl = (x <= 5);

        if (bl) {
            System.out.println("boolean doğrudur");
        } else {
            System.out.println("boolean yanlıştır.");
        }

        /* alinin fizik notu 50
        kimya notu 30
        ort. 50 üzerinde ise ekrana geçti yazsın
        ort. 50 altındaysa ekrana kaldı yazsın
         */

        double fizikNot = 50;
        double kimyaNot = 30;

        double ort = (fizikNot + kimyaNot) / 2;

        if (ort>=50) {
            System.out.println("Geçti");
        }
        else {
            System.out.println("Kaldı");
        }

    }
}
