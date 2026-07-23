package linkedList;

public class TraversalCircularLL {
  public static void main(String[] args) {
    ListNode head = ListNode.createList();
    ListNode temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = head;// Circular bana do
    printList(head);
    head = reverseCircular(head);
    System.out.println("\nReversed Circular List:");
    printList(head);
    head = deleteNode(head, 4);
    System.out.println("\nAfter deleting 4:");
    printList(head);
  }

  public static void printList(ListNode head) {
    // System.out.print(head.data+" ");
    // Node temp= head.next;
    // while(temp!=head){
    // System.out.print(temp.data+" ");
    // temp=temp.next;
    // }

    // OR
    ListNode temp = head;
    while (temp.next != head) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.print(temp.val + " ");

  }
  //REVERSE
  public static ListNode reverseCircular(ListNode head) {
    ListNode tail = head;
    while (tail.next != head)
      tail = tail.next;
    tail.next = null;
    reverse(head);
    head.next = tail;
    return tail;

  }

  public static ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode fwd = null;
    ListNode curr = head;
    while (curr != null) {
      fwd = curr.next;
      curr.next = prev;
      prev = curr;
      curr = fwd;
    }
    return prev;
  }
//DElETE
  static ListNode deleteNode(ListNode head, int key) {
    ListNode tail = head;
    while (tail.next != head) {
      tail = tail.next;
    }
    tail.next = null;
    if (head.val == key) {
      head = head.next;
      tail.next = head;
      return head;
    }
    ListNode temp = head;
    ListNode temp2 = head.next;
    while (temp2 != null) {
      if (temp2.val == key) {
        if (temp2 == tail) {
          tail = temp;
        }
        temp.next = temp2.next;
        break;
      }
      temp = temp.next;
      temp2 = temp2.next;
    }
    tail.next = head;
    return head;
  }
}
