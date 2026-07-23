package linkedList;

public class TraversalCircularLL {
  public static void main(String[] args) {
    ListNode head = ListNode.createList();
     ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
         temp.next = head;// Circular bana do
         printList(head);
         System.out.println();
      ListNode ans= reverseCircular(head);
      ListNode.printCircular(head);
  }

  public static void printList(ListNode head) {
    // System.out.print(head.data+" ");
    // Node temp= head.next;
    // while(temp!=head){
    // System.out.print(temp.data+" ");
    // temp=temp.next;
    // }

    // OR
    ListNode temp = head;
    while (temp.next != head) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.print(temp.val + " ");

  }
  public static ListNode reverseCircular(ListNode head) {
        ListNode tail=head;
        while(tail.next!=head) tail=tail.next;
        tail.next=null;
        reverse(head);
        head.next=tail;
        return tail;
        
    }
     public static ListNode reverse(ListNode head){
         ListNode prev= null;
         ListNode fwd= null;
         ListNode curr= head;
         while(curr!=null){
             fwd= curr.next;
             curr.next=prev;
             prev=curr;
             curr=fwd;
         }
         return prev;
     }
}
