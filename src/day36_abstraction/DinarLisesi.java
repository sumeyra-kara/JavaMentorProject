package day36_abstraction;

import java.util.ArrayList;

public class DinarLisesi extends Okul_Ilce{

    public DinarLisesi(String il) {
        super(il);
    }

    @Override
    protected ArrayList<String> ogrenciListe() {
        return new ArrayList<>();
    }

    @Override
    protected void dersProgrami() {
        System.out.println("Dinar Lisesi Ders Programı");
    }

    @Override
    protected void ogretmenListesi() {

    }

    public String yemekListesi(){
       return  "Dinar Lisesi yemek listesi";
    }
}
