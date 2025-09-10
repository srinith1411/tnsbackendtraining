package tnsjavaCollectionsFramework;
// Generics demo in Java
// Covers: Generic Class, Generic Method, Bounded Type, Wildcards

import java.util.*;

class Box<T> { // Generic class
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class genericsDemo {
    
    // Generic method
    public static <E> void printArray(E[] arr) {
        for (E element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    // Bounded type example
    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
    
    // Wildcard example
    public static void displayList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        System.out.println("---- Generic Class ----");
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("Box contains: " + stringBox.get());
        
        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println("Box contains: " + intBox.get());

        System.out.println("\n---- Generic Method ----");
        String[] names = {"Ram", "Sita", "Lakshman"};
        Integer[] nums = {10, 20, 30};
        printArray(names);
        printArray(nums);

        System.out.println("\n---- Bounded Type ----");
        double sum = add(10, 20); // int auto-boxed to Integer
        System.out.println("Sum = " + sum);

        System.out.println("\n---- Wildcards ----");
        List<String> fruits = Arrays.asList("Apple", "Mango", "Banana");
        List<Double> prices = Arrays.asList(10.5, 20.0, 30.25);
        displayList(fruits);
        displayList(prices);
    }
}



