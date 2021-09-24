package Lesson5;

public class Lesson5 {

    int summa(int a, int b, int c) {

        int result = a+b+c;
        return result;

    }

    int average(int a1, int b1, int c1) {

        int result = summa(a1,b1,c1)/3;
        return result;

    }

}

class Test20 {

    public static void main(String[] args) {

        Lesson5 t = new Lesson5();
        int v = 4, d = 10, y = 12;
        int asd = t.average(v, d, y);
        System.out.println(asd);

    }

}