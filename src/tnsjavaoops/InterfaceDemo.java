package tnsjavaoops;

// Interface.
interface Movable {
    void move();
}

// Class implementing interface
class Car implements Movable {
    public void move() {
        System.out.println("Car is moving");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Movable myCar = new Car();
        myCar.move();
    }
}
