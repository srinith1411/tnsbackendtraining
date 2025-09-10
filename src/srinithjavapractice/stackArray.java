package srinithjavapractice;

public class stackArray {
private  int a[];
private int size;
private int capacity;
private int top;

public stackArray(int s){
this.capacity=s;
a=new int[capacity];
top=-1;
}
public void push(int val){
    if(size==capacity){
        System.out.println("stack full");
        return;
    }
    top++;
    a[top]=val;
    size++;
}

public int pop(){
   if(size==0){
    System.out.println("stack empty");
    return -1;
   } 
   int x=a[top];
   top--;
   size--;
   return x;
}
public boolean isEmpty(){
    return size==0;
}
public int peek(){
    if(size==0){
        System.out.println("empty stack!!");
        return -1;
    }
    return a[top];
}
public int getSize(){
    return size;
}
public boolean isFull() {
    return size == capacity;
}
public void display() {
        if (size == 0) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements (top→bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


}