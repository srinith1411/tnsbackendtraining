package tnsjavaoops;

class Animal {}

class Dog extends Animal {}

public class InstanceOfDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal));

        Animal animal = new Animal();
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog));
    }
}
