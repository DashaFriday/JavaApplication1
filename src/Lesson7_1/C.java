package Lesson7_1;

import Homework.Lesson6;
import Lesson7.A;

public class C {

    public static void main(String[] args) {

        Lesson7.A a = new Lesson7.A(200); //Почему-то принимает и без "Lesson7.". Возможно зависит от IDE
        System.out.println(a.salary);
        System.out.println("C");
        a.salaryX2();

    }

}
