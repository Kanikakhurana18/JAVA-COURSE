package linkedList;
class Node{
  int val;
  Node next;
  Node(int val){
    this.val=val;
  }
   static void display(Node head){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next; //imp
    }
    System.out.println();
  }
  static void displayRecursively(Node head){
    if(head==null) return;
    displayRecursively(head.next); //reverse manner mai print hoga
    System.out.print(head.val+" ");
  }
}

class LinkedList{
  Node head;
  Node tail;
  int size;
  // LinkedList(){
  //   head=tail=null;//not needed in java
  // }
  void addAtTail(int val){
    Node temp= new Node(val);
    if(tail==null) head=tail=temp;//head aur tail dono ek hi node ko point karenge. of empty hui to
    else{
      tail.next=temp;
      tail=temp; 
    }
    size++;
  }
  void addAtHead(int val){
    Node temp= new Node(val);
    if(head==null) head=tail=temp;
    else{
      temp.next=head;
      head=temp;
    }
    size++;
  }
  void deleteAtHead(){
    if(head==null){ System.out.println("empty");//List already empty hai kya?
    return;}
    head=head.next;
    if(head==null) tail=null; //if 1 size ka element ho ie Maan lo list me sirf 1 node hai.
    size--;
  }
  void deleteAtTail(){
    if(head==null){ System.out.println("Empty");
      return;
    }
    if(head==tail){ head=tail=null;
    size--;
    System.out.println("empty");
    return;}
    Node temp=head;
    while(temp.next!=tail){
      temp=temp.next;
    }
    temp.next=null;
    tail=temp;
    size--;
  }
  int search(int val){
    if(head==null) return-1;
    Node temp=head;
    int idx=0;
    while(temp!=null){
      if(temp.val==val) return idx;
      temp=temp.next;
      idx++;
    }
    return-1;
  }
  void insert(int idx, int val){
    if(idx<0 || idx>size){
       System.out.println("Invalid index");
       return;}
    else if(idx==0) addAtHead(val);
    else if(idx==size) addAtTail(val);
    else{
      Node temp =head;
      for(int i=1;i<=idx-1;i++){
        temp=temp.next;
      }
        Node t= new Node(val);
        t.next=temp.next;
        temp.next=t;
        size++;
    }
  }
  void delete(int idx){
    if(idx<0 || idx>=size){
       System.out.println("Invalid index");
       return;}
    if(idx==0) {
      deleteAtHead();
      return;}
    Node temp= head;
    for(int i=1;i<=idx-1;i++){
      temp=temp.next;
    }
    temp.next=temp.next.next;
    if(idx==size-1) tail=temp;
    size--;
  }
  void display(){
    if(head==null) return;
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
    System.out.println();
  }
}

public class ClassLinkedListCode {
  static int get(Node head, int idx){
    Node temp= head;
    for(int i=0;i<idx;i++){
      if(temp==null) return -1;
      temp=temp.next;
    }
    if(temp==null)
        return -1;
    return temp.val;
  }
  public static void main(String[] args) {
    Node a= new Node(10); //a.val=10
    Node b= new Node(20); //b.val=20
    Node c = new Node(30); //c.val=30
    //connect karenge like link karenge
    a.next=b;
    b.next=c;
    // c.next=null;//not always written
    // System.out.println(a.next.next.val); // c ki value 30
    Node.display(a);//class ka naam (data type) as display class is static so write full Node
    // Node.displayRecursively(a); //reverse order mai print kr dega
    
    // Node n=null; //NullPointerException
    // System.out.println(n.val); //error OR (n.next)
    System.out.println(get(a, 0)); 
    
    LinkedList ll= new LinkedList();
    ll.addAtTail(200);//object (reference variable) ka naam ll is object so to access that write a.
    ll.addAtTail(300);
    ll.display();

    ll.addAtHead(100);
    ll.display();

    ll.deleteAtHead();
    ll.display();
    System.out.println(ll.size);

    ll.deleteAtTail();
    ll.display();
    ll.deleteAtTail();
    ll.display();

    ll.insert(0, 100);
    ll.insert(1, 200);
    ll.display();
    System.out.println(ll.size);

    System.out.println(ll.search(200));

    ll.delete(1);
    ll.display();
  }
}
