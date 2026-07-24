package linkedList.doublyLinkedList;
class DNode{
  int val;
  DNode next;
  DNode prev;
  DNode(int val){
    this.val=val;
  }
}
class Dll{
  DNode head;
  DNode tail;
  int size;

  void addAtHead(int val){
    DNode temp=new DNode(val);
    if(head==null) head=tail=temp;
    else{
      temp.next=head;
      head.prev=temp;
      head=temp;
    }
    size++;
  }

  void addAtTail(int val){
    DNode temp=new DNode(val);
    if(head==null) head=tail=temp;
    else{
      tail.next=temp;
      temp.prev=tail;
      tail=temp;
    }
    size++;
  }

  void deleteAtHead(){
    if(size==0){
      System.out.println("List is empty");
      return;
    }
    if(size==1) head=tail=null;
    else{
      head=head.next;
      head.prev=null;
    }
    size--;
  }

  void deleteAtTail(){
    if(size==0){
      System.out.println("list is empty");
      return;
    }
    if(size==1) head= tail=null;
    else{
      tail=tail.prev;
      tail.next=null;
    }
    size--;
  }

  void insert(int idx, int val){
    if(idx<0 || idx>size){
      System.out.println("Invalid index");
      return;
    }
    if(idx==0){
       addAtHead(val);
       return;
    }
    if(idx==size){
      addAtTail(val);
      return;
    }
    DNode a= new DNode(val);
    DNode temp= head;
    for(int i=1;i<=idx-1;i++){
      temp=temp.next;
    }
    DNode b=temp.next;
    temp.next=a;
    a.prev=temp;
    a.next=b;
    b.prev=a;
    size++;
  }

  void delete(int idx){
    if(idx<0 || idx>=size) {
      System.out.println("Invalid index");
      return;
    }
    if(idx==0) {
      deleteAtHead();
      return;
    }
    if(idx==size-1){ //total size se one less index hote hai
      deleteAtTail();
      return;
    }
  DNode temp= head;
  for(int i=1;i<=idx-1;i++){
    temp=temp.next;
  }
  temp.next=temp.next.next; //temp.next ki value change ho gayi.
  temp.next.prev=temp; //ye updated next ki value ko prev ko next se connect krega
  size--;
  }
  void display(){
    DNode temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
    System.out.println();
  }

  void displayReverse(){
    DNode temp=  tail;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.prev;
    }
    System.out.println();
  }

   void createList() {
        addAtTail(10);
        addAtTail(20);
        addAtTail(30);
        addAtTail(40);
        addAtTail(50);
        addAtTail(60);
    }
}

public class BasicClassCode {
  public static void main(String[] args) {
    Dll list= new Dll();
    list.addAtHead(10);
    list.addAtHead(20);
    list.addAtHead(30);
    list.display();
    list.displayReverse();
    list.addAtTail(40);
    System.out.println(list.size);
    list.display();

    list.deleteAtHead();
    System.out.println(list.size);
    list.display();
    list.deleteAtTail();
    list.display();

    list.insert(1, 30);
    list.display();
    System.out.println(list.size);

    list.delete(1);
    list.display();
  }
}
