abstract class Animal {
    abstract void eat();
}

interface Movable {
    void move();
}

class Dog extends Animal implements Movable {
    void eat() {
        System.out.println("Dog eats bones");
    }

    public void move() {
        System.out.println("Dog runs fast");
    }
}

public class AbstractCheck {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.move();
    }
}
