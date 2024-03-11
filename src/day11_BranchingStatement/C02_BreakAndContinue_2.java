package day11_BranchingStatement;

public class C02_BreakAndContinue_2 {
    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++) {
            if (i>4) break;
            System.out.println(i);
        }

        int n=0;

        while (true){
            if (n==10) break;
            System.out.println("Hello");
            n++;
        }
    }
}
