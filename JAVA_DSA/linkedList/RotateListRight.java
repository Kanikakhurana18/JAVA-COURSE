package linkedList;

public class RotateListRight {
  public static void main(String[] args) {
    ListNode head = ListNode.createList();//createList method ListNode class ke andar hai.
    System.out.print("Before: ");
    ListNode.display(head);
    int k=2;
    head = rotateRight(head,k);
    System.out.print("After: ");
    ListNode.display(head);
  }
  public static int length(ListNode head){
        int len=0;
        ListNode temp=head;
        while(temp!=null) {
            temp= temp.next;
            len++;
        }
        return len;
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int n= length(head);
        k%=n;
        if(k==0) return head;
        //OR FOR LEFT ROTATION 
        // k = n - k;
        ListNode slow= head;
        ListNode fast= head;
        for(int i=1;i<=k+1;i++){
            fast= fast.next;
        }
        while(fast!=null){
            slow= slow.next;
            fast= fast.next;
        }
        ListNode a = slow.next;
        slow.next= null;
        ListNode tail= a;
        while(tail.next!=null){
            tail=tail.next;
        } 
        tail.next= head;
        return a;
    }


    //OR LEFT ROTATION USING TEMP
    //  if(head == null || head.next == null) return head;
    //     int n= length(head);
    //     k%=n;
    //     if(k==0) return head;
    //     Node temp = head;
    //     for(int i = 1; i < k; i++){
    //         temp = temp.next;
    //     }
    //     Node newHead = temp.next;
    //     temp.next = null;
    //     Node tail = newHead;
    //     while(tail.next != null){
    //         tail = tail.next;
    //     }
    //     tail.next = head;
    //     return newHead;
}
