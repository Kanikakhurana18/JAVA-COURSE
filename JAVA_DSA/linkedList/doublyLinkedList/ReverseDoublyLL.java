package linkedList.doublyLinkedList;

public class ReverseDoublyLL{
  public static void main(String args[]){
    Dll list = new Dll();
    list.createList();
    System.out.println("Original:");
    list.display();
    list.head = reverse(list.head);
    System.out.println("After Rotation:");
    list.display();;
  }
   public static DNode reverse(DNode head) {
      DNode curr= head;
      DNode pre= null;
      DNode fwd=null;
      while(curr!=null){
          fwd=curr.next;
          curr.next=pre;
          curr.prev=fwd; //imp
          pre=curr;
          curr=fwd;
      }
      return pre;
    
    //OR
    // if(head.next==null) return head;
    // Node temp= null;
    // Node curr= head;
    // while(curr!=null){
    //     temp=curr.prev;
    //     curr.prev=curr.next;
    //     curr.next=temp;
    //     curr=curr.prev;
    // }
    // return temp.prev;
        
    }
}