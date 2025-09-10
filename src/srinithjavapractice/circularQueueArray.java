package srinithjavapractice;

public class circularQueueArray {
private int f;
private int r;
private int[] a;
int size;
int capacity;
public circularQueueArray(int c){
this.capacity=c;
f=-1;
r=-1;
size=0;
a=new int[capacity];
}
public void add(int val){
    if(size==capacity) {
        System.out.println("queue full!!");
    }
    else if (size==0){
        f=r=0;
        a[r]=val;
    }
    else if(r<capacity-1){
       a[++r]=val;
    }
    else if(r==capacity-1){
        r=0;
        a[r]=val;
    }
    size++;
}
public int remove() {
    if (size == 0) {
        System.out.println("empty queue!!");
        return -1;
    }
    
    int x = a[f];  // store the element to return

    if (size == 1) {
        // if only one element was there, reset queue
        f = r = -1;
    } else {
        // move front forward circularly
        f = (f + 1) % capacity;
    }

    size--;
    return x;
}

public int peek(){
    if(size==0){
        System.out.println("empty queue!!");
        return -1;
     }
     return a[f];
}
public int getSize(){
    return size;
}
public boolean isEmpty(){
    return size==0;
}
public void display(){
    if(size==0){
        System.out.println("empty queue!!");
        return;
    }

    int i = f;
    for (int count = 0; count < size; count++) {
        System.out.println(a[i] + "\n");
        i = (i + 1) % capacity;   // move circularly
    }
}
}
