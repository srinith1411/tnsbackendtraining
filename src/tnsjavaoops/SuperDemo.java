package tnsjavaoops;

// Parent class
class Vehicle {
    String type = "Vehicle";

    void displayType() {
        System.out.println("This is a general vehicle");
    }
}

// Child class
class Bike extends Vehicle {
    String type = "Bike";
@Override
    void displayType() {
        // Access parent variable
        System.out.println("Parent type: " + super.type);
        // Access child variable
        System.out.println("Child type: " + this.type);
        // Call parent method
        super.displayType();
        // Call child method
        System.out.println("This is a specific bike");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.displayType();
    }
}
