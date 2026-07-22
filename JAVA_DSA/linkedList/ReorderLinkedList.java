package linkedList;
public class ReorderLinkedList{
  public static void main(String[] args){
    ListNode head = ListNode.createList();//createList method ListNode class ke andar hai.
    reorderList(head);
    ListNode.display(head); // ya apna display method use karo
  }
     public static ListNode reverse(ListNode head){
        ListNode curr= head;
        ListNode prev= null;
        ListNode fwd= null;
        while(curr!=null){
        fwd= curr.next;
        curr.next= prev;
        prev= curr;
        curr= fwd;
        }
        return prev;
    }
    public  static void reorderList(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        ListNode head2= slow.next;
        slow.next= null;
        head2=reverse(head2);
        //now rearrange and merge
        ListNode i= head;
        ListNode j= head2;
        while(j!=null){
            ListNode t1= i.next;//2
            ListNode t2= j.next;//6
            i.next=j;
            j.next=t1;
            i=t1;
            j=t2;
        }

        //OR
    // ArrayList<ListNode> list = new ArrayList<>();
    // while(head != null){
    //     list.add(head);
    //     head = head.next;
    // }
    // int i = 0;
    // int j = list.size()-1;
    // while(i < j){
    //     list.get(i).next = list.get(j);
    //     i++;
    //     if(i == j) //odd length ll ke liye
    //         break;
    //     list.get(j).next = list.get(i);
    //     j--;
    // }
    // list.get(i).next = null;
    }
}