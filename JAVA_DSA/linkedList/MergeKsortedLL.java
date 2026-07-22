package linkedList;
public class MergeKsortedLL {
  public static void main(String[] args){
    ListNode l1 = ListNode.createList();
    ListNode l2 = ListNode.createList();
    ListNode l3 = ListNode.createList();
    ListNode[] lists = {l1, l2, l3};
    ListNode ans = mergeKLists(lists);
    ListNode.display(ans);
  }
   public static ListNode merge(ListNode head1,ListNode head2){
        ListNode i= head1;
        ListNode j= head2;
        ListNode dummy= new ListNode(-1);
        ListNode k= dummy;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                k.next=i;
                i=i.next;
            }
            else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        if(i==null) k.next=j;
        else k.next=i;
        return dummy.next;
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        int interval=1;//kitni distance par wali lists ko merge karna hai.
        while(interval<lists.length){
            for(int i=0;i+interval<lists.length;i+=interval*2){
            lists[i]= merge(lists[i],lists[i+interval]);
            }
            interval*=2;
        }
        return lists[0];

        //OR
        // if(lists.length==0) return null; //TC=O(nk^2)
        // ArrayList<ListNode> arr= new ArrayList<>();
        // for(ListNode n:lists) arr.add(n);
        // while(arr.size()>1){
        //     ListNode a= arr.get(arr.size()-1);
        //     arr.remove(arr.size()-1);
        //     ListNode b= arr.get(arr.size()-1);
        //     arr.remove(arr.size()-1);
        //     ListNode c= merge(a,b);
        //     arr.add(c);
        // }
        // return arr.get(0);
      }
}
