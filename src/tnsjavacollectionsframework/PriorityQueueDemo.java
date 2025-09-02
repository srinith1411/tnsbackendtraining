package tnsjavaCollectionsFramework;
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        System.out.println("PriorityQueue: " + pq);

        // Peek (see the smallest element)
        System.out.println("Peek: " + pq.peek());

        // Remove elements
        System.out.println("Poll (removed): " + pq.poll());
        System.out.println("After poll: " + pq);

        // Iterate over queue
        System.out.print("Iterating: ");
        for (int num : pq) {
            System.out.print(num + " ");
        }
    }
}

