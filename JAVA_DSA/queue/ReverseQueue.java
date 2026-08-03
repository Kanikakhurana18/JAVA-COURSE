package queue;

import java.util.*;

public class ReverseQueue {
  public static void main(String[] args){
    Queue<Integer> q= new LinkedList<>();
    q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
    System.out.println(q);
    Stack<Integer> st= new Stack<>();
    while(!q.isEmpty()){
      st.push(q.remove());
    }
    while(st.size()>0){
      q.add(st.pop());
    }
    System.out.println(q);
    
    //Now using RECURSION
    reverseQueue(q);
    System.out.println(q);
  }
  
  //Using recursion callstack AS=O(N) and Tc=O(n)
  static void reverseQueue(Queue<Integer> q){
    if(q.isEmpty()) return;
    int x= q.remove();
    reverseQueue(q);  // Reverse remaining queue
    q.add(x); // Add removed element at rear
  }
}
