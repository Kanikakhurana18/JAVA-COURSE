package linkedList;

public class DetectLoopInList {
  public static void main(String[] args) {
    ListNode head = ListNode.createList();
     // Cycle create karo
    head.next.next.next.next = head.next;
    System.out.println(hasCycle(head));
  }
  public static boolean hasCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
             if(fast==slow) {
            return true;
        }
        }
        return false;
    }
}
