package srinithjavapractice;

class node {
    int data;
    node next;
    public node(int data){
        this.data=data;
    }
}
public class queueSLL {
private node f; //FRONT POINTER
private  node r;  //REAR POINTER
private int size;
public queueSLL(){
    f=null;
    r=null;
}

public void add(int val){
    node n=new node(val);
    if(size==0){
        f=r=n;
    }
    else{
    r.next=n;
    r=n;
}
size++;
}
public int remove(){
    if(f==null)
    {
        System.out.println("empty queue!!");
        return -1;
    }
    if(size==1){
            f=r=null;
        }
    else{
        int x=f.data;
        f=f.next;
        size--;
        if(f == null){    // queue became empty
           r = null;     // reset rear too
          }
        return x;
    }
}

public int peek(){
    if(f==null)
    {
        System.out.println("empty queue!!");
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
    if(f==null)
    {
        System.out.println("empty queue!!");
        return;
    }
    else{
        node t=f;
        while(t!=null){
            System.out.println(t.data+"\n");
            t=t.next;
        }
    }
}
}
