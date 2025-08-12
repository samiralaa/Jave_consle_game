abstract class Vehicle {
    abstract void start();

    abstract void stop();
}

class Car extends Vehicle {
    protected String name;
    private int speed;
    private int fuel;

    public Car(String name, int speed, int fuel) {
        this.fuel = fuel;
        this.name = name;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void drive() {
        System.out.println(name + " is driving at " + speed + " km/h");
    }

    @Override
    void start() {
        System.out.println(name + " is starting.");
    }

    @Override
    void stop() {
        System.out.println(name + " is stopping.");
    }
}

class SportCar extends Car {
    public SportCar(String name, int speed, int fuel) {
        super(name, speed, fuel);
    }

    @Override
    void start() {
        System.out.println(name + " (SportCar) is starting.");
    }

    @Override
    public void drive() {
        System.out.println(name + " (SportCar) is driving at " + getSpeed() + " km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        SportCar mySportCar = new SportCar("Ferrari", 200, 30);
        mySportCar.start();
        mySportCar.drive();
    }
}
