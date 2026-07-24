package linkedList.doublyLinkedList;

public class RotateLeftDLL {
  public static void main(String[] args) {
    Dll list = new Dll();
    list.createList();
    System.out.println("Original:");
    list.display();
    list.head = rotateDLL(list.head, 2);
    System.out.println("After Rotation:");
    list.display();
}
  public static int length(DNode head){
        int length=0;
        DNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        return length;
    }
    public static DNode rotateDLL(DNode head, int k) {
        if(head==null || head.next==null) return head;
        int n= length(head);
        k%=n;
        if(k==0) return head;
        DNode temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        DNode a=temp.next;
        DNode tail= a;
        while(tail.next!=null){ //if written tail then give null pointer exception
            tail=tail.next;
        }
        tail.next=head;
        head.prev=tail;
        
        temp.next=null;
        a.prev=null;
        return a;
    }
  }
