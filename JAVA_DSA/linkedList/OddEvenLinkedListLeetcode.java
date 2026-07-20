package linkedList;

public class OddEvenLinkedListLeetcode {
  public static void main(String[] args) {
    ListNode head = ListNode.createList();//createList method ListNode class ke andar hai.
    System.out.print("Before: ");
    ListNode.display(head);
    head = oddEvenList(head);
    System.out.print("After: ");
    ListNode.display(head);
  }
  public static ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd= head;
        ListNode even = head.next;
        ListNode evenhead = even;
        while(even!=null && even.next!=null){
            odd.next= even.next;
            odd= odd.next;
            even.next= odd.next;
            even= even.next;
        }
        odd.next= evenhead;
        return head;


        //OR
        // ListNode odd= new ListNode(-1);
        // ListNode even= new ListNode(-1);
        // ListNode t1= odd;
        // ListNode t2= even;
        // ListNode t= head;
        // while(t!=null){
        //     t1.next= t;
        //     t=t.next;
        //     t1= t1.next;
        //     t2.next=t;
        //     if(t!=null) t= t.next;
        //     t2= t2.next;
        // }
        // t1.next= even.next;
        // return odd.next;
    }
}

