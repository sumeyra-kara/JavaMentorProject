package day32_inheritance;

public class _Z_01Test {
    public static void main(String[] args) {
        Poultry chicken = new Poultry();


        System.out.println(chicken.breed); //Not defined
        System.out.println(chicken.color); //Undefined
        System.out.println(chicken.gender);//Undefined

        chicken.hareket(); // yürürler
        chicken.beslenme(); // et ve ot yerler
        chicken.cogalma(); //yumurta
        chicken.kanat(); //kanatlıdırlar
        chicken.solunum(); //akçiğer
        chicken.omur(); // yaşar ve ölür
        chicken.gaga(); // gagaları vardır.

        WildBirds eagle = new WildBirds();
        System.out.println(eagle.breed); //Not defined
        System.out.println(eagle.color); //null
        System.out.println(eagle.gender);//Undefined

        eagle.hareket(); // uçarlar
        eagle.beslenme(); // et yerler
        eagle.cogalma(); //yumurta
        eagle.pence(); // pençeleri vardır.
        eagle.kanat(); //kanatlıdırlar
        eagle.solunum(); //akciğer
        eagle.omur(); // yaşar ve ölür
        eagle.gaga(); // sivri gagalıdır.

        Birds bird = new Birds();
        System.out.println(bird.breed); //Not defined
        System.out.println(bird.color); //Undefined
        System.out.println(bird.gender);//Undefined

        bird.hareket(); // hareket ederler
        bird.beslenme(); // beslenirler
        bird.cogalma(); //yumurta
        //bird.pence(); // CTE
        bird.kanat(); //kanatlıdırlar
        bird.solunum(); //akciğer
        bird.omur(); // yaşar ve ölür
        bird.gaga(); // sivri gagalıdır.

        eagle.print();
    }
}
