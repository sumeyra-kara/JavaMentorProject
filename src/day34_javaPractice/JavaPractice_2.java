package day34_javaPractice;

import java.util.Arrays;

public class JavaPractice_2 {

    public static void main(String[] args) {
        String str = "((())))(()";
        System.out.println(isValidParentheses(str));
        System.out.println(isValidParentheses_1(str));


    }

    public static boolean isValidParentheses(String str){
        while (str.contains("()")){
            str = str.replace("()","");
        }
        return str.isEmpty();
    }

    public static boolean isValidParentheses_1(String str){

        int count = 0;
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if (c == '('){
                count++;
            }
            else if (c == ')'){
                count--;
            }
            if (count < 0){
                return false;
            }
        }

        return count == 0;
    }
}
