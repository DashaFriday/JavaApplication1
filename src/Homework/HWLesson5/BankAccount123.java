package Homework.HWLesson5;

public class BankAccount123 {

    int id;
    String name;
    double balance;

    double popolnenieScheta (double a) {

        balance+=a;
        return balance;

    }

    double snyatieSoScheta (double a) {

        balance-=a;
        return balance;

    }

}

class BankAccTest {

    public static void main(String[] args) {
        BankAccount123 bA = new BankAccount123();

        System.out.println(bA.popolnenieScheta(11));
        System.out.println(bA.snyatieSoScheta(3.8));
    }

}