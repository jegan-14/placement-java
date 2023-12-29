public class VehicleProgram {

    public static void main(String[] args) {
        Car car = new Car(4, 5);
        Motorcycle motorcycle = new Motorcycle(2, 2);

        System.out.println("Car Speed: " + car.calculateSpeed());
        System.out.println("Motorcycle Speed: " + motorcycle.calculateSpeed());

        if (car.calculateSpeed() > motorcycle.calculateSpeed()) {
            System.out.println("The car has the highest effective speed.");
        } 
        else if (car.calculateSpeed() < motorcycle.calculateSpeed()) {
            System.out.println("The motorcycle has the highest effective speed.");
        }
        else {
            System.out.println("Both vehicles have the same effective speed.");
        }
    }
}

class Vehicle {
    int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    double calculateSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    int passengers;

    public Car(int speed, int passengers) {
        super(speed);
        this.passengers = passengers;
    }

    @Override
    double calculateSpeed() {
        return super.calculateSpeed() * passengers;
    }
}

class Motorcycle extends Vehicle {
    int wheels;

    public Motorcycle(int speed, int wheels) {
        super(speed);
        this.wheels = wheels;
    }

    @Override
    double calculateSpeed() {
        return super.calculateSpeed() * wheels;
    }
}
