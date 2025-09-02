package tnsjavaCollectionsFramework;

import java.util.*;
public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Create an ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements at the end
        deque.add("A");
        deque.add("B");
        deque.add("C");

        System.out.println("Deque after adding: " + deque);

        // Add element at first position
        deque.addFirst("Start");
        System.out.println("After addFirst: " + deque);

        // Add element at last position
        deque.addLast("End");
        System.out.println("After addLast: " + deque);

        // Remove elements
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

        // Peek elements
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        // Iterate over deque
        System.out.print("Iterating: ");
        for (String item : deque) {
            System.out.print(item + " ");
        }
    }
}

