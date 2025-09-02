package tnsjavaCollectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Numbers List: " + numbers);

        // Add element at first and last
        numbers.addFirst(5);
        numbers.addLast(50);
        System.out.println("After Adding First and Last: " + numbers);

        // Remove elements
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After Removing First and Last: " + numbers);

        // Get element
        System.out.println("First Element: " + numbers.getFirst());
        System.out.println("Last Element: " + numbers.getLast());

        // Check size
        System.out.println("Size: " + numbers.size());

        // Iterate through LinkedList
        System.out.println("\nIterating through LinkedList:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
