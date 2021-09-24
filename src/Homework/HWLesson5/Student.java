package Homework.HWLesson5;

public class Student {

    int studentID;
    String name;
    String surname;
    short year;
    double math;
    double economy;
    double foreinLang;

}

class StudentTest {

    double averageScore(Student s) {
        double result = (s.math + s.economy + s.foreinLang)/3;
        System.out.println(result);
        return result;
    }

    public static void main (String [] args) {

        Student student1 = new Student();

        student1.studentID = 1;
        student1.name = "Ivan";
        student1.surname = "Petrov";
        student1.year = 2017;
        student1.math = 4;
        student1.economy = 5;
        student1.foreinLang = 4;

        Student student2 = new Student();

        student2.studentID = 2;
        student2.name = "Pavel";
        student2.surname = "Nicolaev";
        student2.year = 2018;
        student2.math = 3;
        student2.economy = 3;
        student2.foreinLang = 4;

        Student student3 = new Student();

        student3.studentID = 3;
        student3.name = "Roman";
        student3.surname = "Sokolov";
        student3.year = 2017;
        student3.math = 5;
        student3.economy = 5;
        student3.foreinLang = 5;

        StudentTest st = new StudentTest();
        st.averageScore(student1);
        st.averageScore(student2);
        st.averageScore(student3);
    }

}