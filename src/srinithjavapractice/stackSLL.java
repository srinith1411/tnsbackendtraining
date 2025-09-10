package srinithjavapractice;

 class node{
    int data;
   node next;
public node(int d){
   data=d;
}
}
public class stackSLL {
   private node top;
   private int size;
   public stackSLL(){
      this.top=null;
   }

 public  void push(int val){
   node n=new node(val);
         n.next=top;
         top=n;
         size++;
      }
      


   public int pop() {
    if(top==null){
       return -1;
      }
      if(size==1){
            top=null;
        }
      else{
         int x=top.data;
         top=top.next;
         size--;
         return x;
      }
   }
   public int peek(){
    if(top==null){
      return -1;
      }
    return top.data;
   }

   public boolean isEmpty(){
      return size==0;
   }

   public void display(){
      if(top==null){
       System.out.println("stack empty");
      }
      else{
         node t=top;
         while(t!=null){
            System.out.println(t.data+"\n");
            t=t.next;
         }
      }
   }
   public int getSize()
   {
      return size;
   }
}


