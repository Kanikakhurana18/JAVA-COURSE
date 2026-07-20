package linkedList;

public class RemoveNthNodeFromEndLis {
  public static void main(String[] args) {
    ListNode head=ListNode.createList();
    int n=2;
     System.out.print("Before: ");
    ListNode.display(head);
    head=removeNthFromEnd(head,n);
    System.out.print("After n=2: ");
    ListNode.display(head);
  }
   public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
