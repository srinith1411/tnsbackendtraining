package srinithjavapractice;

public class queueArray {
    int capacity=0; 
    int size;
    int a[];
     int f=-1;
    int r=-1; 
   public queueArray(int s) {
        this.capacity=s;
        a=new int[capacity];
   }
   public void add(int val){
     if (size == capacity) {                               // queue already full
        System.out.println("Overflow! Queue is full.");
        return;
    }

    if (f == -1) {   // queue empty → first element
        f = 0;
        r = 0;
    } else {
        r = r + 1;   // move rear forward
    }

    a[r] = val;
    size++;
}     
public int remove(){
    if(size==0){
        return -1;
    }
    else{
        int x=a[f];
        f++;
        size--;
        return x;
    }
}
public boolean isEmpty(){
    return size==0;
}
public int getSize(){
    return size;
}
public int peek(){
     if(size==0){
        return -1;
     }
     else{
        return a[f];
     }
}
public void display(){
    if(size==0){
        System.out.println("empty queue");
    }
    else{
        for(int i=f;i<=r;i++){
            System.out.println(a[i]+"");
        }
        System.out.println("");
    }
}
}

