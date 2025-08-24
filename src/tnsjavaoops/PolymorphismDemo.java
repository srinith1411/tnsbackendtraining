package tnsjavaoops;

class Calculator {
    // Compile-time polymorphism (method overloading)
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    // Runtime polymorphism (method overriding)
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Compile-time
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(10, 20));
        System.out.println("Sum: " + calc.add(10, 20, 30));

        // Runtime
        Animal obj = new Dog();
        obj.sound();
    }
}
