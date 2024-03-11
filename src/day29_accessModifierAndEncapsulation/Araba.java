package day29_accessModifierAndEncapsulation;

 public class Araba {
    private String marka;
    private String model ;
    private int yas;
    private boolean hasarliMi;
    private String renk;

    public static int satisToplami;
    private int tekilSatis;

    public String getMarka() {
        return marka;
    }

    public Araba() {

    }

    public void setTekilSatis(int tekilSatis) {
        this.tekilSatis = tekilSatis;
        satisToplami+=tekilSatis;
    }

    public void setMarka(String marka) {
        if (marka.isEmpty() || marka.isBlank()){
            System.err.println("Lütfen markayı giriniz");
            return;
        }
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>10){
            System.out.println("Bu yasta araba almıyoruz");
            return;
        }
        this.yas = yas;
    }

    public boolean isHasarliMi() {
        return hasarliMi;
    }

    public void setHasarliMi(boolean hasarliMi) {
        this.hasarliMi = hasarliMi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
