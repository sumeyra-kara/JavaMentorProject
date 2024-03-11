package day30_encapsulation_static;

import static day30_encapsulation_static.BankaMusterisi.*;
import static java.lang.Math.*;

public class BankaMusterisiTest_2 {
    public static void main(String[] args) throws ClassNotFoundException {

       Class.forName("day30_encapsulation_static.BankaMusterisi");
        BankaMusterisi bankaMusterisi1= new BankaMusterisi();
        BankaMusterisi bankaMusterisi2= new BankaMusterisi();
        BankaMusterisi bankaMusterisi3= new BankaMusterisi();

        bankaMusterisi1.setAdSoyad("Asuman Laleli");

        BankaMusterisi.subClass sub = new BankaMusterisi.subClass();
        sub.print();

        hesapAcmaKurallari(bankaMusterisi1);

       double db = pow(2,3)+ round(2.9);

    }


}
