package day36_abstraction;

import java.util.ArrayList;

public abstract class Okul_Ilce extends Okul_Vilayet {


    public static String ilce = "Dinar";

    public Okul_Ilce(String il) {
        super(il);
    }

    public String mudur(){
        return "İlçe Milli Eğitim Müdürü Vahap Kansız";
    }

    protected abstract ArrayList<String> ogrenciListe();
    protected abstract void dersProgrami();

    protected int yardim(){
        return 0;
    }
}
