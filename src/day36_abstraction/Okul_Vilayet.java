package day36_abstraction;

import java.util.ArrayList;

public abstract class Okul_Vilayet {

    public Okul_Vilayet(String il){
        System.out.println(il);
        System.out.println("Yeni eğitim yılında başarılar dileriz.");
    }
    static {
        System.out.println("Ders saatlerine riayet edilecektir");
    }

    {
        System.out.println("Temizliğe DİKKAT");
    }

    public final static String il = "Afyon";

    protected String mudur(){
        return "İl Milli Eğitim Müdürü: Hanife Coşkun";
    }


    protected abstract ArrayList<String> ogrenciListe();
    protected abstract void dersProgrami();

    protected abstract void ogretmenListesi();

    protected abstract int yardim();

    public static void temizlik(){
        System.out.println("Her sınıfa bir görevli olacaktır.");
        System.out.println("WC.ler her tenefüs temizlenecektir.");
    }

}
