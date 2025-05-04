abstract class Employee {
    abstract void work();
}

interface Payment {
    void getSalary();
}

class Developer extends Employee implements Payment {
    void work() {
        System.out.println("Developer writes code");
    }

    public void getSalary() {
        System.out.println("Developer gets 1 lakh salary");
    }
}

public class Abstra {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.work();
        dev.getSalary();
    }
}
