package day36_abstraction;

public class Test {
    public static void main(String[] args) {
        DinarLisesi dinarLisesi = new DinarLisesi("Afyon");
        MehmetAkifErsoyOO oo = new MehmetAkifErsoyOO("Afyon");

        Okul_Vilayet.temizlik();
        System.out.println(Okul_Vilayet.il);

    }
}
