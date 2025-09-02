package tnsjavaCollectionsFramework;

import java.util.*;
public class StackDemo {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Initial Stack: " + stack);

        // Peek top
        System.out.println("Peek top: " + stack.peek());

        // Pop top
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);

        // Search for element
        System.out.println("Position of 10: " + stack.search(10));

        // Traversal using Iterator
        System.out.print("Iterator traversal: ");
        Iterator<Integer> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}

