package linkedList;

public class PalindromeLinkedList {
  public static void main(String[] args) {
    ListNode head = ListNode.createList();
    boolean ans= isPalindrome(head);
    System.out.println(ans);
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
    public static boolean isPalindrome(ListNode head) {
        ListNode slow= head; //leftMiddle
        ListNode fast= head;
        while(fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        ListNode head2= slow.next;
        slow.next=null; //break list
        head2= reverse(head2);
        ListNode i= head;
        ListNode j= head2;
        while(j!=null){
            if(i.val!=j.val) return false;
            i=i.next;
            j=j.next;
        }
        return true;


        //OR
        // ListNode temp= head;
        // ArrayList<Integer> arr= new ArrayList<>();
        // while(temp!=null){
        //     arr.add(temp.val);
        //     temp= temp.next;
        // }
        // int i=0, j=arr.size()-1;
        // while(i<=j){
        //     int a=arr.get(i);
        //     int b= arr.get(j);
        //     if(a!=b) return false;
        //     i++;
        //     j--;
        // }
        // return true;
    }
}
