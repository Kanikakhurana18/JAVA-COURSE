package linkedList;

public class IntersectionOfTwoList {
  public static void main(String[] args) {
    ListNode common = new ListNode(8);// Common part
    common.next = new ListNode(10);
    ListNode head1 = new ListNode(1);// First List: 1 -> 2 -> 3 -> 8 -> 10
    head1.next = new ListNode(2);
    head1.next.next = new ListNode(3);
    head1.next.next.next = common;
    ListNode head2 = new ListNode(4);// Second List: 4 -> 5 -> 8 -> 10
    head2.next = new ListNode(5);
    head2.next.next = common;
    System.out.print("List 1: ");
    ListNode.display(head1);
    System.out.print("List 2: ");
    ListNode.display(head2);
    ListNode ans = getIntersectionNode(head1, head2);
    if(ans != null)
        System.out.println("Intersection Node: " + ans.val);
    else
        System.out.println("No Intersection");
  }
   public static ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        int len1=0;
        ListNode temp1= head1;
        while(temp1!=null){
            temp1= temp1.next;
            len1++;
        }
        int len2=0;
        ListNode temp2= head2;
        while(temp2!=null){
            temp2= temp2.next;
            len2++;
        }
        temp1= head1;
        temp2= head2;
        if(len1>len2){ //temp1 ko aage bdhayenge
            for(int i=1;i<=len1-len2;i++){
                temp1=temp1.next;
            }
        }
        else{ //temp2 ko aage
            for(int i=1;i<=len2-len1;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}
