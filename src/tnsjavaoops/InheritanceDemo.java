package tnsjavaoops;
class Animal{
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog acquires animal class properties.");
        System.out.println("Dog barks");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
