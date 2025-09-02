package tnsjavacollectionsframework;
import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a vector
        Vector<String> vector = new Vector<>();

        // Add elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        System.out.println("Vector: " + vector);

        // Access elements..
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());

        // Remove an element
        vector.remove("Banana");
        System.out.println("After removing Banana: " + vector);

        // Traversal using Iterator
        System.out.print("Iterator traversal: ");
        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
