package srinithjavapractice;

import java.util.Scanner;

public class circularQueueLinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circularQueueLinkedList queue = new circularQueueLinkedList();
        int choice;

        do {
            System.out.println("\n*** CIRCULAR QUEUE MENU (LINKED LIST) ***");
            System.out.println("1. Enqueue (Add)");
            System.out.println("2. Dequeue (Remove)");
            System.out.println("3. Peek Front");
            System.out.println("4. Display Queue");
            System.out.println("5. Get Size");
            System.out.println("6. Check if Empty");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    queue.add(val);
                    System.out.println(val + " added to queue.");
                    break;

                case 2:
                    int removed = queue.remove();
                    if (removed != -1) {
                        System.out.println("Dequeued: " + removed);
                    }
                    else{
                        System.out.println("EMPTY QUEUE!!");
                    }
                    break;

                case 3:
                    int frontVal = queue.peek();
                    if (frontVal != -1) {
                        System.out.println("Front element: " + frontVal);
                    }
                    else{
                        System.out.println("EMPTY QUEUE!!");
                    }
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    System.out.println("Current size: " + queue.getSize());
                    break;

                case 6:
                    System.out.println("Is queue empty? " + queue.isEmpty());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while(choice != 7);

        sc.close();
    }
}
