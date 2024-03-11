package day11_BranchingStatement;

public class C03_LabelStatement {
    public static void main(String[] args) {


  outer:for (int i = 0; i < 5; i++) {
            System.out.print ("A ");
            inner:for (int j = 0; j < 100; j++) {
                if (j==1){
                    break inner;
                }
                System.out.print ("*");
            }
            System.out.println();
        }


        //birden yüze kadar sayıları yazdıralım ama 30-50 arası yazdırılmasın

        for (int i = 1; i <=100; i++) {
            if (i>=30 && i<=50){
                continue;
            }
            if (i>70){
                break;
            }
            System.out.print(i+" ");
        }

        //birden yüze kadar sayıları yazdıralım ama 70 den sonrası yazdırılmasın
        for (int i = 1; i <=100; i++) {
            if (i>70){
                break;
            }
            System.out.print(i+" ");
        }

    }
}
