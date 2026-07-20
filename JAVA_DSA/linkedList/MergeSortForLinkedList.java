package linkedList;

public class MergeSortForLinkedList {
  public static void main(String[] args) {
    ListNode head = new ListNode(4);
    head.next = new ListNode(3);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(1);
    head.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next = new ListNode(5);
    ListNode.display(head);
    head=sortList(head);
    ListNode.display(head);
  }
   public static ListNode sortList(ListNode head) {
    if(head==null ||head.next==null) return head;
        ListNode slow= head;
        ListNode fast= head;
        while(fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next= null;//break list
        head= sortList(head);
        head2=sortList(head2);
        return merge (head,head2);
    }
    public static ListNode merge(ListNode head1, ListNode head2) {
        ListNode i= head1;
        ListNode j= head2;
        ListNode dummy= new ListNode(-1);
        ListNode k= dummy;
        while(i!=null && j!= null){
            if(i.val<= j.val){
                k.next= i;
                i=i.next;
            }
            else{
                k.next=j;
                j= j.next;
            }
            k= k.next;
        }
        if(i==null) k.next=j;
        else k.next=i;
        return dummy.next;
    }
}
