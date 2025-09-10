package srinithjavapractice;

import java.util.Scanner;

public class queueArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        queueArray q = new queueArray(n);

        int ch;
        do {
            System.out.println("\n*** MAIN MENU ***");
            System.out.println("1. Insert data");
            System.out.println("2. Remove data");
            System.out.println("3. Peek");
            System.out.println("4. Get size");
            System.out.println("5. Check if empty");
            System.out.println("6. display");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    int size=q.getSize();
                    if(size!=n) {
                    System.out.print("Enter data: ");
                    q.add(sc.nextInt());
                   // System.out.println("Data added!!");
                    }
                    else{
                        System.out.println("queue already full");
                    }
                    break;

                case 2:
                    int x = q.remove();
                    if(x!=-1)
                    System.out.println("Removed: " + x);
                    else{
                        System.out.println("queue empty");
                    }
                    break;

                case 3:
                    int y = q.peek();
                    if(y!=-1)
                    System.out.println("peek element: " + y);
                    else{
                        System.out.println("queue empty");
                    }
                    break;

                case 4:
                    int s = q.getSize();
                    System.out.println("Current size: " + s);
                    break;

                case 5:
                    boolean b = q.isEmpty();
                    System.out.println(" " + b);
                    break;

                case 6:
                    q.display();
                    break;
              case 7:
                System.out.println("Exiting program...");
                break;

                default:
                    System.out.println("Invalid choice!!");
            }
        } while (ch != 7);

        sc.close();
    }
}
