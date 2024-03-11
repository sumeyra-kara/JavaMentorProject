package day11_BranchingStatement;

import day12_Methods.C01_MethodsIntro;

public class C01_BreakAndContinue {
    public static void main(String[] args) {


//        for (int i = 0; i < 5; i++) {
//            if (i==2) {
//                continue;}
//            System.out.println(i);
//        }


        for (int i = 0; i < 3; i++) {
            System.out.print("A");
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue;
                }
                System.out.print("*");
            }
            if (i==1){
                continue;
            }
            System.out.println();
        }


    }
}
//A**
//A**
//A**
