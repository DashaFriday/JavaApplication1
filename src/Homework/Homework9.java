package Homework;

public class Homework9 {

    int a;
    double b;
    String c;

    void asd () {
        System.out.println(c + " " + b);
    }

    void asdf () {
        System.out.println(c + " " + a);
    }

}

class Homework9Test {

    public static void main(String[] args) {

        Homework9 q = new Homework9();  //1
        Homework9 w = new Homework9();  //2
        new Homework9();                //3 //3
        Homework9 e = new Homework9();  //4
        Homework9 r = new Homework9();  //5
        new Homework9();                //6 //6
        Homework9 y = new Homework9();  //7
        Homework9 u = new Homework9();  //8

        q.a = 12;
        q.asdf();
        q = e;                          //1

        e.a = 123;
        e.b = 1234.5;
        e.c = "StringRingRing";

        q.asd();
        e.asd();

        w.asd();
        w = null;                       //2

        e = r;                          //4
        r = y;                          //5

        y.a = 78;
        y.c = "hjklkjhg";
        r.asdf();
        y.asdf();

        u.b = 567.008;
        u.asd();

    }

}

class Test1 {

    int a = 1;
    static int a2 = 2;

    void asd(int a) {

        System.out.println(a);
        System.out.println(this.a);

    }

    public static void main(String[] args) {

        Test1 t = new Test1();
        t.asd(3);

    }

}

class Test2 {

    int a = 1;
    static int b = 2;

    static void asd (final int a) {

        System.out.println(a);
        System.out.println(Test2.b);

    }

    public static void main(String[] args) {

        asd(5);
        asd(4);

    }

}

class Test3 {

    int a = 1;
    static int b = 2;

    void asd(int a) {

        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);

    }

    public static void main(String[] args) {

        Test3 t = new Test3();
        t.asd(4);

    }

}