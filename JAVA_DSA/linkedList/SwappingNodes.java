package linkedList;

public class SwappingNodes {
  public static void main(String[] args) {
    ListNode head=ListNode.createList();
    int n=2;
    System.out.print("Before: ");
    ListNode.display(head);
    head=swapNodes(head,n);
    System.out.print("After n=2: ");
    ListNode.display(head);
  }
   public static ListNode swapNodes(ListNode head, int k) {
        ListNode slow= head;
        ListNode fast= head;
        for(int i=1;i<=k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast=head;
        for(int i=1;i<=k-1;i++){
            fast=fast.next;
        }
        //swap
        int temp=fast.val;
        fast.val=slow.val;
        slow.val=temp;
        return head;
    }
}
