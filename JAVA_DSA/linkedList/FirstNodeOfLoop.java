package linkedList;

public class FirstNodeOfLoop {
  public static void main(String[] args) {
    ListNode head = ListNode.createList();
    // Cycle create karo
    head.next.next.next.next = head.next;
    ListNode ans = detectCycle(head);
    if (ans != null) {
      System.out.println("Cycle starts at: " + ans.val);
    } else {
      System.out.println("No Cycle");
    }
  }

  public static ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null)
      return null;
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        ListNode third = head;
        while (third != slow) {
          third = third.next;
          slow = slow.next;
        }
        return third;
      }
    }
    return null;
  }
}
