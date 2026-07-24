package linkedList;

public class InsertInCircularSortedLinkedList {
  public static void main(String[] args) {
    ListNode head = ListNode.createList();
    ListNode temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = head;// Circular bana do
    System.out.println("Original Circular List:");
    ListNode.printCircular(head);
    head=sortedInsert(head, 3);
    System.out.println("After inserting 3:");
    ListNode.printCircular(head);
  }
  public static ListNode sortedInsert(ListNode head, int val) {
       ListNode node= new ListNode(val);
       if(head==null){ //empty
           node.next=node; //wahi node hi insert krenge
           return node;
       }
       if(val<=head.val){ //head pe insert karo also val can be equal so<=
           ListNode tail= head;
           while(tail.next!=head) tail=tail.next;
           tail.next=node;
           node.next=head;
           return node;
       }
       ListNode curr=head; //beech mai insert krna hai 
         while(curr.next != head && curr.next.val<val){ //data se compare hoga which is less than our given data
          //also agr equal data insert krna hai to while loop break ho jayega and aage steps insert ho jayega
            curr = curr.next; //age badhao jb wo less than data na mile
        }//5 ko insert krna hai bw 4 and 7
        node.next= curr.next; //5->7 as curr 4 pe hai
        curr.next=node;//curr 4 pe hai curr.next=5 which is node
        return head;
    }
}
