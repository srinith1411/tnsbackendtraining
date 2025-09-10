package srinithjavapractice;

class node {
    int data;
    node next;
    public node(int d){
        data=d;
    }
}

public class circularQueueLinkedList {
    private node f;
    private node r;
    int size;
    public circularQueueLinkedList(){
        f=null;
        r=null;
        size=0;
    }
    public void add(int val){
        node n=new node(val);
        if(size==0){
            f=r=n;
            r.next=f;
        }
        else{
            r.next=n;
            r=n;
            r.next=f;    // 1->2->1
              }
              size++;
    }
    public int remove(){
        int x=f.data;
        if(f==null){
            return -1;
        }
         else if(size==1){
            f=r=null;
        }
        else{
            f=f.next;
            r.next=f;
        }
        size--;
        return x;

    }

    public int peek(){
        if(f==null){
            return -1;
        }
        else{
            return f.data;
        }
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void display(){
        if(f==null){
            System.out.println("empty queue!!");
        }
        else{
            node t=f;
            while(t!=r){
                System.out.println(t.data+"\n");
                t=t.next;
            }
            System.out.println(r.data);
        }
    }
}
