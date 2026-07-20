package linkedList;

public class DeleteMiddleOfLinkedList {
 public static void main(String[] args) {
  ListNode head = ListNode.createList();//createList method ListNode class ke andar hai.
    System.out.print("Before: ");
    ListNode.display(head);
    head = deleteMiddle(head);
    System.out.print("After: ");
    ListNode.display(head);
 }

    public static ListNode deleteMiddle(ListNode head) {
     //Slow fast approach Tc=O(n) SC=O(1)
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        if(head==null ||head.next==null) return null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;

         //Brute force Approach O(n)
        // if(head.next==null) return null;
        // int length=0;
        // ListNode temp= head;
        // while(temp!=null){
        //     temp=temp.next;
        //     length++;
        // }
        // temp=head;
        // for(int i=1;i<length/2;i++){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        // return head;
    }
  }

