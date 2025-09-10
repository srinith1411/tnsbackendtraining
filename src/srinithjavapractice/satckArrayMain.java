package srinithjavapractice;

import java.util.Scanner;

public class satckArrayMain {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("enter size:");
     int size=s.nextInt();
     stackArray st=new stackArray(size);

     int ch;
     do{
        System.out.println("MAIN MENU");
        System.out.println("1.push data");
        System.out.println("2.pop data");
        System.out.println("3.peek");
        System.out.println("4.getsize");
        System.out.println("5.isempty");
        System.out.println("6.display");
        System.out.println("7.exit");
        System.out.println("enter your choice (1-7)");
        ch=s.nextInt();
        switch(ch){
        case 1:
                    if(st.isFull()) {                // ✅ check before push
                        System.out.println("Stack is full! Cannot push.");
                    } else {
                        System.out.print("Enter value to push: ");
                        int val = s.nextInt();
                        st.push(val);               // now safe to push
                    }
                    break;
                case 2:
                    int x=st.pop();
                    if(x!=-1){
                    System.out.println("Popped: " + x);
                    }
                    else{
                        System.out.println("STACK EMPTY");
                    }
                    break;
                case 3:
                   int x1=st.peek();
                    if(x1!=-1){
                    System.out.println("peek element is: " + x1);
                    }
                    else{
                        System.out.println("STACK EMPTY");
                    }
                    break;
                case 4:
                    System.out.println("Current size: " + st.getSize());
                    break;
                case 5:
                    System.out.println("Is empty? " + st.isEmpty());
                    break;
                case 6:
                    st.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    while(ch != 8);
}
}

