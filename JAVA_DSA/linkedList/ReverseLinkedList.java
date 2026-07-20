package linkedList;

public class ReverseLinkedList {
  public static void main(String[] args) {
    ListNode head = ListNode.createList();// createList method ListNode class ke andar hai.
    System.out.print("Before: ");
    ListNode.display(head);
    head = reverseList(head);
    System.out.print("After: ");
    ListNode.display(head);
  }

  public static ListNode reverseList(ListNode head) {
    // using recursion tc= sc=O(n)
    if (head == null || head.next == null)
      return head;
    ListNode a = head.next;
    head.next = null;
    ListNode b = reverseList(a);
    a.next = head;
    return b;

    // OR tc= O(N) sC=o(1)
    // ListNode curr= head;
    // ListNode prev= null;
    // ListNode fwd= null;
    // while(curr!=null){
    // fwd= curr.next;//save the next node
    // curr.next= prev; //connect with previous
    // prev= curr;
    // curr=fwd;
    // }
    // return prev;

    // OR
    // if(head==null || head.next==null) return head;
    // ListNode temp= head;
    // ArrayList<ListNode> arr= new ArrayList<>();
    // while(temp!=null){
    // arr.add(temp);
    // temp= temp.next;
    // }
    // int n= arr.size();
    // for(int i=n-1;i>=1;i--){
    // ListNode t1= arr.get(i);
    // ListNode t2= arr.get(i-1);
    // t1.next=t2;
    // }
    // arr.get(0).next=null;
    // return arr.get(n-1);
  }
}
