package Homework;

public class Lesson8 {

    final static double pipi = 3.14;

    int a,b,c;

    static int mult (int a1, int b1, int c1) {

        return a1*b1*c1;

    }

    static void divi (int a2, int b2) {

        System.out.println("Целое частное: " + a2/b2);
        System.out.println("Остаток: " + a2%b2);

    }

    void square (double r) {

        System.out.println("Площадь круга: " + r*r*pipi);

    }

    static void leng (double r) {

        System.out.println("Длина окружности: " + 2*pipi*r);

    }

    void info (double r) {

        System.out.println("Радиус: " + r);
        square(r);
        leng(r);

    }

}

class Lesson8Test {

    public static void main(String[] args) {

        System.out.println(Lesson8.mult(13, 12, 11));
        Lesson8.divi(10,5);

        Lesson8 l1 = new Lesson8();
        l1.a = 12;
        l1.b = 13;
        l1.c = 11;

        System.out.println(Lesson8.mult(l1.a, l1.b, l1.c));
        Lesson8.divi(l1.a, l1.b);

        System.out.println();

        l1.square(33);
        Lesson8.leng(45);
        l1.info(22);

    }

}