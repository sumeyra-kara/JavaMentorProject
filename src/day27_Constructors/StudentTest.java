package day27_Constructors;

import java.util.Random;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {


        Student student_1 = new Student("Hasan","Kaya",21);
        System.out.println("student_1 = " + student_1);

        student_1.name="Mehmet";
        student_1.lastName="Ayaz";
        student_1.number = 155;
        student_1.gender ='E';
        student_1.isDorm = true;

        System.out.println("student_1 = " + student_1);

        Student student_2 = new Student("Ali","Akyaka",366);
        System.out.println("student_2 = " + student_2);

        Student student_3 =   new Student("Ahmet","Ay",363,'E',false);

        System.out.println("student_3 = " + student_3);

        System.out.println(student_1.generateStudentAccessCode());
        System.out.println(student_2.generateStudentAccessCode());


    }
}
