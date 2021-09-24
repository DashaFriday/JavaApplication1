package Homework.HWLesson5;

public class Employee {

    Employee (int id2, String sur, int age2, double sal, String dep) {

        id = id2;
        surmane = sur;
        age = age2;
        salary = sal;
        department = dep;

    }

    int id;
    String surmane;
    int age;
    double salary;
    String department;

    void dobledo () {
        salary*=2;
    }

}

class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee(13, "Kravchenko", 22, 13.5, "Buhgaltery");
        Employee e2 = new Employee(34, "Sokolov", 33, 345.44, "IT");

        e1.dobledo();
        e2.dobledo();

        System.out.println(e1.salary);
        System.out.println(e2.salary);

    }
}
