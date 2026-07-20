package linkedList;

public class RemoveDuplicateSortedList2 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(4);
    head.next.next.next.next.next = new ListNode(4);
    ListNode.display(head);
    head=deleteDuplicates(head);
    ListNode.display(head);
  }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
          // Duplicate group mila
            if (curr.next != null && curr.val == curr.next.val) {
              while (curr.next != null && curr.val == curr.next.val) {// Puri duplicate group skip karo
                    curr = curr.next;
                }
                // Duplicate group ke baad wali node se jod do
                prev.next = curr.next;
            }
            else {
                // Ye node unique hai, ise answer mein rakhna hai
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;


      //OR
        // ListNode dummy =new ListNode(-1);
        // ListNode i= head;//i will travel linked list
        // ListNode t= dummy;
        // while(i!=null){
        //     if(i.next==null || i.val!=i.next.val){
        //         t.next=i;
        //         t=i;
        //         i=i.next; //i++
        //     }
        //     else{//i.val==i.next.val
        //     ListNode j= i.next;
        //     while(j!=null && j.val== i.val){
        //         j= j.next;
        //     }
        //         i=j;
        //     }
        // }
        //  t.next=i;
        // return dummy.next;
    }
}
