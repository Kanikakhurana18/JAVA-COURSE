package linkedList;
public class ReverseSublist{
  public static void main(String[] args) {
    ListNode head = ListNode.createList();//createList method ListNode class ke andar hai.
    System.out.print("Before: ");
    ListNode.display(head);
    int left=2, right=5;//these are porsition not index starting from 1,2,3...
    head = reverseBetween(head,left,right);
    System.out.print("After: ");
    ListNode.display(head);
  }
   public static ListNode reverse(ListNode head){
        ListNode curr= head;
        ListNode prev=null;
        ListNode fwd=null;
        while(curr!=null){
        fwd=curr.next;
        curr.next=prev;
        prev=curr;
        curr=fwd;
        }
        return prev;
    }
    public static ListNode reverseBetween(ListNode head, int l, int r) {
        if(head==null) return head;
        //TC=Sc=O(1)
        ListNode dummy =new ListNode(-1);
        ListNode temp= dummy;
        dummy.next= head;
        for(int i=1;i<=l-1;i++){
            temp=temp.next;
        }
        ListNode tail1= temp;
        ListNode head2= temp.next;
        for(int i=1;i<=r-l+1;i++){
            temp=temp.next;
        }
        ListNode tail2= temp;
        ListNode head3= temp.next;
        tail1.next=null;
        tail2.next=null;

        reverse(head2);

        tail1.next=tail2;
        head2.next=head3;
        return dummy.next;


        // //OR [Using Arraylist] TC= SC=O(n)
        // ArrayList<ListNode> arr= new ArrayList<>();
        // ListNode temp= head;
        // while(temp!=null){
        //     arr.add(temp);
        //     temp= temp.next;
        // }
        // int i= a-1, j=b-1;
        // while(i<j){
        //     ListNode t1=arr.get(i);
        //     ListNode t2= arr.get(j);
        //     arr.set(i,t2);
        //     arr.set(j,t1);
        //     i++;
        //     j--;
        // }
        // for(i=0;i<arr.size();i++){
        //     if(i==arr.size()-1){
        //         arr.get(i).next=null;
        //         break;}
        //     arr.get(i).next=arr.get(i+1);
        //     }
        // return arr.get(0);
}
}