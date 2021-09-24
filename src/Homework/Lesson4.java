
package Homework;

public class Lesson4 {
    
}

class Student {
    
    int studentID;
    String name;
    String surname;
    short year;
    double math;
    double economy;
    double foreinLang;
    
}

class StudentTest {
    
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
        student3.economy = 4;
        student3.foreinLang = 5;
        
        System.out.println("Average score of " + student1.name + " " + student1.surname + " - " + 
                (student1.math + student1.economy + student1.foreinLang)/3);
        System.out.println("Average score of " + student2.name + " " + student2.surname + " - " + 
                (student2.math + student2.economy + student2.foreinLang)/3);
        System.out.println("Average score of " + student3.name + " " + student3.surname + " - " + 
                (student3.math + student3.economy + student3.foreinLang)/3);
    }
    
}