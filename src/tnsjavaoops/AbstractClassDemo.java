package tnsjavaoops;

// Abstract class
abstract class Vehicle {
    abstract void start(); // abstract method

    void fuel() {
        System.out.println("Refueling Vehicle");
    }
}

// Concrete class
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick start");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        myBike.start();  // calls Bike's implementation
        myBike.fuel();   // calls method from abstract class
    }
}
