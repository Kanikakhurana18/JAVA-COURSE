package queue;//FIFO- First in first out [Add rear end se hota hai] [remove and peek front end se hota hai]

import java.util.LinkedList;
import java.util.Queue;

public class TraversalInQueue {
  public static void display(Queue<Integer> q){
    int n= q.size();
    for(int i=1;i<=n;i++){
      System.out.print(q.peek()+" ");
      q.add(q.remove());
    }
  }
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(10); q.add(20); q.add(50); q.add(40);
    System.out.println(q);
    display(q);
  }
}
