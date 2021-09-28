package Lesson8;

public class Lesson8 {

//    public final int a;
//
//    Lesson8 () {
//        a = 123;
//    }
//
//    Lesson8 (boolean b) {
//        a = 12;
//    }

}


class Car {
    String color = "blue";
    String engine = "V6";
}

class Human {

    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
//        h1.c = new Car();                 //Компилятор не позволяет так делать, потому что
//        h1.c = new Car();                 //указан final для объекта Car
        h1.c.engine = "V8";
    }

}
