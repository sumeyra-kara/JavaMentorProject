package day27_Constructors;

public class Student {

    Student (){
    }

    Student (String name, String lastName, int number){
        this.name=name;
        this.lastName=lastName;
        this.number=number;
    }

    public Student(String name, String lastName, int number, char gender, boolean isDorm) {
        this.name = name;
        this.lastName = lastName;
        this.number = number;
        this.gender = gender;
        this.isDorm = isDorm;
    }

    String name = "No valid name entered";
    String  lastName = "No valid lastname entered";
    int number;
    char gender;
    boolean isDorm;

    public String generateStudentAccessCode(){
        return name.substring(0,1)+lastName.substring(lastName.length()-1)+number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                ", gender=" + gender +
                ", isDorm=" + isDorm +
                '}';
    }
}
