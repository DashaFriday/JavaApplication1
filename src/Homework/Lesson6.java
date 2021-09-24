package Homework;

public class Lesson6 {
}

class overloaded {

    int summy(int a1, int b1, int c1, int d1) {
        System.out.println(a1 + b1 + c1 + d1);
        return a1 + b1 + c1 + d1;
    }

    int summy(int a2, int b2, int c2) {
        int summyResult = summy(a2, b2, c2, 0);
        return summyResult;
    }

    int summy(int a2, int b2) {
        int summyResult = summy(a2, b2, 0, 0);
        return summyResult;
    }

    int summy(int a2) {
        int summyResult = summy(a2, 0, 0, 0);
        return summyResult;
    }

    int summy() {
        int summyResult = summy(0, 0, 0, 0);
        return summyResult;
    }

}

class Stud {

    Stud(int id2, String name2, String sur2, int year2, double math2, double econ2, double forLa2) {

        studentID = id2;
        name = name2;
        surname = sur2;
        year = year2;
        math = math2;
        economy = econ2;
        foreinLang = forLa2;

    }

    Stud(int id3, String name3, String sur3, int year3) {

        this(id3, name3, sur3, year3, 0, 0, 0);

    }

    Stud() {

    }

    int studentID;
    String name;
    String surname;
    int year;
    double math;
    double economy;
    double foreinLang;

}

class StudTest {

    double averageScore(Stud s) {
        double result = (s.math + s.economy + s.foreinLang) / 3;
        System.out.println(result);
        return result;
    }

    public static void main (String[] args) {

        overloaded ov = new overloaded();
        ov.summy();
        ov.summy(12);
        ov.summy(12, 10);
        ov.summy(12, 10, 8);
        ov.summy(12, 10, 8, 6);

        Stud student1 = new Stud(1, "Ivan", "Petrov", 2, 8.3, 9.0, 7.8);

        Stud student2 = new Stud(2, "Pavel", "Nicolaev", 3);

//        student2.studentID = ;
//        student2.name = ;
//        student2.surname = ;
//        student2.year = 2018;
        student2.math = 3;
        student2.economy = 3;
        student2.foreinLang = 4;

        Stud student3 = new Stud();

        student3.studentID = 3;
        student3.name = "Roman";
        student3.surname = "Sokolov";
        student3.year = 2017;
        student3.math = 5;
        student3.economy = 5;
        student3.foreinLang = 5;

        StudTest st = new StudTest();
        st.averageScore(student1);
        st.averageScore(student2);
        st.averageScore(student3);
    }

}