package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RearrangementOfQueue{
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    System.out.println("Before: " + q);
    rearrangeQueue(q);
    System.out.println("After : " + q);
  }
   public static void rearrangeQueue(Queue<Integer> q) {
        //Using extra Stack //TC=SC=O(n)
        Stack<Integer> st= new Stack<>();
        int n=q.size();
        for(int i=1;i<=n/2;i++){ //first half
            st.push(q.remove());
        }
        while(st.size()>0) q.add(st.pop());
        
        for(int i=1;i<=n/2;i++){ //second half
            st.push(q.remove());
        }
        
        //rearrange
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        //reverse queue
        while(q.size()>0) st.push(q.remove());
        while(st.size()>0) q.add(st.pop());
    
        
        //OR
        //using extra queue //TC=SC=O(n)
        // Queue<Integer> q2= new LinkedList<>();
        // int n=q.size();
        // for(int i=1;i<=n/2;i++){
        //     q2.add(q.remove());
        // }
        // while(q2.size()>0){
        //     q.add(q2.remove());
        //     q.add(q.remove());
        // }
        
    }
}