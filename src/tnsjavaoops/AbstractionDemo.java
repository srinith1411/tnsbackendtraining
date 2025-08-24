package tnsjavaoops;

// Abstract class
abstract class Shape {
    abstract void draw(); // abstract method

    void areaMessage() {
        System.out.println("Area depends on the shape type");
    }
}

// Concrete class
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.draw();
        obj.areaMessage();
    }
}
