package Lesson5;

public class Car2 {

    Car2 (String cvet, String motor) {  //Свой конструктор может использоваться для стартового задания
                                        //дефолтных значений
        color = cvet;
        engine = motor;

    }

    String color;
    String engine;
    int speed;

    int gas (int skorost) {
        speed+=skorost;
        return speed;
    }

    int tormos (int skorost) {
        speed-=skorost;
        return speed;
    }

    void showInfo () {
        System.out.println("Color: " + color + "\n" +
                "Engine: " + engine + "\n" +
                "Speed: " + speed);
    }
}

class Car2Test {

    public static void main(String[] args) {
        Car2 c1 = new Car2("Yellow", "AB2");
        c1.speed = 60;

        c1.showInfo();
        c1.gas(20);
        c1.tormos(30);
        c1.showInfo();
    }

}