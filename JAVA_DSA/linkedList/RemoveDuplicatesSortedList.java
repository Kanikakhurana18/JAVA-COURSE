package linkedList;

public class RemoveDuplicatesSortedList {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(1);
    head.next.next.next.next = new ListNode(2);
    ListNode.display(head);
    head = deleteDuplicates(head);
    ListNode.display(head);
  }
  public static ListNode deleteDuplicates(ListNode head) {
    ListNode curr= head;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val) curr.next=curr.next.next;
            else curr= curr.next;
        }
        return head;

        //OR
        // if(head==null) return null;
        // ListNode i= head;
        // ListNode j= head;
        // while(j!=null){
        //     if(i.val==j.val) j= j.next;
        //     else{
        //         i.next=j;
        //         i=j;
        //     }
        // }
        //  i.next=j;
        //  return head;
    }
}
