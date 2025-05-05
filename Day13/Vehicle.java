class Vehicle {
    private String make;
    public int speed;
    protected int fuel;
    int mileage;

    public Vehicle(String make, int speed, int fuel, int mileage) {
        this.make = make;
        this.speed = speed;
        this.fuel = fuel;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void displayInfo() {
        System.out.println("Make: " + getMake());
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuel);
        System.out.println("Mileage: " + mileage);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", 120, 50, 15);
        vehicle.setMake("Honda");
        vehicle.speed = 130;
        vehicle.displayInfo();
    }
}
