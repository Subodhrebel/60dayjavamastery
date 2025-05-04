
interface Vehicle {
    void start();
    void stop();
    default void honk() {
        System.out.println("Honking from Vehicle");
    }
    static void maintenance() {
        System.out.println("Vehicle maintenance check");
    }
}


class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}


class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }
    public void stop() {
        System.out.println("Bike stopped");
    }
    @Override
    public void honk() {
        System.out.println("Bike custom honk");
    }
}


public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.honk();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.honk();
        bike.stop();

        Vehicle.maintenance();
    }
}
