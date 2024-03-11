package day11_BranchingStatement;

public class C04_TamKare {

    public static void main(String[] args) {
        // girilen sayının tam kare ise true yazdırsın değilse false

        int sayi=64;
        boolean tamKareMi=false;
        int index = 1;

        while (index*index<=sayi){
          if (index*index==sayi){
              tamKareMi=true;
              break;
          }
          index++;
        }

        System.out.println("index = " + index);
        System.out.println("tamKareMi = " + tamKareMi);
    }
}
