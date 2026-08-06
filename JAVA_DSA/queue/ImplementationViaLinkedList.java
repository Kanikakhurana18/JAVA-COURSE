package queue;
class Node{
  int val;
  Node next;
  Node(int val){
    this.val=val;
  }
}
class MyQueue{
  Node head;
  Node tail;
  int size;
  void add(int val){ //Tc=O(1)
    Node temp= new Node(val);
    if(size==0) head=tail=temp;
    else{
      tail.next=temp;
      tail=temp;
    }
      size++;
  }
  int remove(){
    if(size==0){
      System.out.println("Queue is empty");
      return -1;
    }
      int front=  head.val;
      head=head.next;
      size--;
      if(size==0){ //if 1 element was there and now it is pointing to null resulting in size 0
        tail = null;
    }
      return front;
  }

  int peek(){
    if(size==0){
       System.out.println("Queue is empty");
      return -1;
    }
    return head.val;
  }

  void display(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
    System.out.println();
  }
}
public class ImplementationViaLinkedList {
  public static void main(String[] args) {
    MyQueue q= new MyQueue(); //Tc=O(1)
    q.add(10);
    q.add(20); 
    q.add(30);
    q.display();
    System.out.println(q.remove());
    q.display();
    System.out.println(q.peek());
  }
}
