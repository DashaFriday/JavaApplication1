package Lesson7;

public class A {

    public double salary;

    public void salaryX2 () {
        System.out.println("Novaya ZP: "+salary*2);
    }

    public A (double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {

        A a = new A(200);
        System.out.println(a.salary);
        System.out.println("A");
        a.salaryX2();

    }

}

class ATest {

    public static void main(String[] args) {

        A a = new A(200);
        System.out.println(a.salary);
        System.out.println("ATest");
        a.salaryX2();

    }

}