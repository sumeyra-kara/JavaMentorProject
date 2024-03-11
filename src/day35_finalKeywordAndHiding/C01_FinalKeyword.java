package day35_finalKeywordAndHiding;

public class C01_FinalKeyword {


    public final String brand ;

//    public C01_FinalKeyword() {
//        brand = "Vestel";
//    }
//
//    public C01_FinalKeyword(String a) {
//        System.out.println(a);
//        brand = "Vestel";
//    }
//    static {
//       brand = "Vestel" ;
//}

    {
        brand = "Vestel";
    }

    protected final void yazdir(String str){
        System.out.println(str);
    }

    protected void yazdir1(String str){
        System.out.println(str);
    }

}
