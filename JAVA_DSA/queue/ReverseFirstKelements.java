package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKelements {
  public static void main(String[] args){
    Queue<Integer> q= new LinkedList<>();
    q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
    System.out.println(q);
    int k=3;
    System.out.println(reverseFirstK(q,k));
  }
  public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if(k<=0 || k>q.size()) return q;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()) q.add(st.pop());
        for(int i=0;i<q.size()-k;i++){
            q.add(q.remove());
        }
        return q;
    }
}
