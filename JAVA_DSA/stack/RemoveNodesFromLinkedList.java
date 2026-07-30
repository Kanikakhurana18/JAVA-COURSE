package stack;

class ListNode{
  int val;
  ListNode next;
  ListNode(int val){
    this.val=val;
  }
}

public class RemoveNodesFromLinkedList {
  public static void main(String[] args){
    ListNode head= new ListNode(5);
     head.next = new ListNode(2);
    head.next.next = new ListNode(13);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(8);
    ListNode ans = removeNodes(head);
    while (ans != null) {
        System.out.print(ans.val + " ");
        ans = ans.next;
    }
  }
   public static ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode i= head;
        ListNode j= head.next;
        while(j!=null){
            if(j.val>=i.val){
                i.next=j;
                i=j;
            }
            j=j.next;
        }
            i.next=null;
        return reverse(head);


        // //OR using LINKED LIST TC=O(n) Sc=(1)
        // head=reverse(head);
        // ListNode curr= head;
        // int max= curr.val;
        // while(curr!=null && curr.next!=null){
        //     if(curr.next.val<max) curr.next= curr.next.next;
        //     else{
        //         curr=curr.next;
        //         max=curr.val;
        //     }
        // }
        //  // Step 3: Reverse again
        // return reverse(head);

        //OR
        // Stack<ListNode> st= new Stack<>(); //Tc=SC=O(n)
        // ListNode temp= head;
        // while(temp!=null){
        //     while(st.size()>0 && st.peek().val<temp.val){
        //         st.pop();
        //     }
        //         st.push(temp);
        //         temp=temp.next;
        // }
        //     while(st.size()>0){
        //         ListNode top= st.pop();
        //         top.next=temp;
        //         temp=top;
        //     }
        //            return temp;

        

    }
    public static ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
}
