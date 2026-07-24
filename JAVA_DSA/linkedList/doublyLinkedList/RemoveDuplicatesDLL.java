package linkedList.doublyLinkedList;

public class RemoveDuplicatesDLL {
  public static void main(String[] args) {
    Dll list = new Dll();
    list.addAtTail(10);
    list.addAtTail(10);
    list.addAtTail(10);
    list.addAtTail(20);
    list.addAtTail(20);
    list.addAtTail(30);
    list.addAtTail(30);
    list.addAtTail(40);
    System.out.println("Original:");
    list.display();
    list.head = removeDuplicates(list.head);
    System.out.println("After Removing Duplicates:");
    list.display();
  }

  public static DNode removeDuplicates(DNode head) {
    // Node curr = head;
    // while(curr != null && curr.next != null){
    // if(curr.data == curr.next.data){
    // curr.next = curr.next.next;
    // if(curr.next != null) curr.next.prev = curr;
    // }
    // else{
    // curr = curr.next;
    // }
    // }
    // return head;

    // OR
    if (head == null)
      return null;
    DNode i = head;
    DNode j = head; // OR j=head.next
    while (j != null) {
      if (i.val == j.val)
        j = j.next;
      else {
        i.next = j;
        j.prev = i;
        i = j;
        j = j.next;
      }
    }
    i.next = null;
    return head;
  }
}
