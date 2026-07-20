package linkedList;

public class PartitionList {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(4);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(2);
    int x=3;
    ListNode.display(head);
    head=partition(head,x);
    ListNode.display(head);
  }
  public static ListNode partition(ListNode head, int x) {
        ListNode d1= new ListNode(-1);
        ListNode d2= new ListNode(-1);
        ListNode t1= d1; //smaller values //1 2 2
        ListNode t2= d2; //larger values //4 3 5 (int order does nnot matter if equal or greater)
        ListNode t= head;
        while(t!=null){
            if(t.val<x){
                t1.next=t;
                t1= t1.next;
            }
            else{
                t2.next= t;
                t2= t2.next;
            }
            t=t.next;
        }
        t1.next= d2.next;
        t2.next= null;
        return d1.next;
    }
}
