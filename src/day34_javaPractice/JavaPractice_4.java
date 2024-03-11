package day34_javaPractice;

public class JavaPractice_4 {
    public static void main(String[] args) {

        System.out.println( maxBlock("xxxuuuuuxxxux"));
    }
    /*
    Given a string, return the length of the largest "block" in the string.
    A block is a run of adjacent chars that are the same.

    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
    maxBlock("asdf") → 1
    maxBlock("xxxuuuuuxux") → 5
     */

    public static int maxBlock(String str){
        if (str.length() == 0) return 0;
        if (str.length() == 1) return 1;

        int max = 1;
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
                count = 1;
            for (int j = i+1; j <str.length() ; j++) {
                if (str.substring(i,(i+1)).equals(str.substring(j,(j+1)))){
                    count++;
                } else {
                    break;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }

}
