package srinithjavapractice;

import java.util.Scanner;

public class stackSLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackSLL stack = new stackSLL();
        int choice;

        do {
            System.out.println("\n*** STACK MENU (SLL) ***");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Get Size");
            System.out.println("6. Check if Empty");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1) {
                        System.out.println("Popped: " + popped);
                    }
                    else{
                        System.out.println("STACK EMPTY");
                    }
                    break;
                case 3:
                    int topVal = stack.peek();
                    if (topVal != -1) {
                        System.out.println("Top element: " + topVal);
                    }
                    else{
                        System.out.println("STACK EMPTY");
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Current size: " + stack.getSize());
                    break;
                case 6:
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);
    }
}
