package Homework.HWLesson7;

public class HWEmployee {

    public HWEmployee (int id2, String sur, double sal) {

        id = id2;
        surmane = sur;
        salary = sal;

    }

    HWEmployee (String sur, int age2) {

        surmane = sur;
        age = age2;

    }

    private HWEmployee (int id2, String sur, int age2, double sal, String dep) {

        id = id2;
        surmane = sur;
        age = age2;
        salary = sal;
        department = dep;

    }

    protected int id;
    public String surmane;
    int age;
    private double salary;
    String department;

    void dobledo() {
        salary *= 2;
    }

    public void printSalary() {

        System.out.println(salary);

    }

    public void printSurname() {

        System.out.println(surmane);

    }

    public void printID() {

        System.out.println(id);

    }
}

class HWEmployeeTest {

    public static void main(String[] args) {

        HWEmployee e1 = new HWEmployee(13, "Kravchenko", 13.5);
        HWEmployee e2 = new HWEmployee(34, "Sokolov", 345.44);

        e1.dobledo();
        e2.dobledo();

        e1.printSalary();
        e1.printID();
        e1.printSurname();

        e2.printSalary();
        e2.printID();
        e2.printSurname();

    }
}
