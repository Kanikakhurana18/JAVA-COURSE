package linkedList;

public class ConvertToCircular {
  public static void main(String[] args) {
    ListNode head = ListNode.createList();
    head = convertToCircular(head);
    ListNode.printCircular(head);
  }
  public static ListNode convertToCircular(ListNode head) {
    if(head==null) return null;
    ListNode temp= head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=head; //make it circular
    return head;
  }
}
