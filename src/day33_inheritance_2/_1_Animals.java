package day33_inheritance_2;

public class _1_Animals {

    String a ="Animal";
    String b;
     String c;
    void hareket( )  {
        System.out.println("hareket ederler");
    }
    void solunum( )  {
        System.out.println("nefes alirlar");
    }
    void beslenme( )  {
        System.out.println("beslenirler");
    }
    void cogalma( )  {
        System.out.println("cogalirlar");
    }
    void omur( )  {
        System.out.println("yasar ve olurler");
    }

        protected  Number aa(){
        return 5;
    }

    @Override
    public String toString() {
        return "_1_Animals{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
}
