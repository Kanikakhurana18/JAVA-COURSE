package queue;
import java.util.LinkedList;
import java.util.Queue;

public class AddRemovePeekAtAnyPosition{
  public static void main(String[] args){
    Queue<Integer> q = new LinkedList<>();
    q.add(20); q.add(30); q.add(40); q.add(50);
    display(q);
    addIndex(q, 2, 60);
    display(q);
    System.out.println(peekAtIndex(q, 2));
    removeAtIndex(q, 2);
    System.out.println(removeAtIndex(q, 2)); //we are returning the element too
    display(q);
  }
  static int peekAtIndex(Queue<Integer> q, int idx){
     if(idx<0 || idx>=q.size()){
      System.out.println("Invalid index");
      return -1;
    }
    int n=q.size();
    for(int i=1;i<=idx;i++){
      q.add(q.remove());
    }
    int x= q.peek();
    for(int i=1;i<=n-idx;i++){
      q.add(q.remove());
    }
    return x;
  }

  static int removeAtIndex(Queue<Integer> q, int idx){
     if(idx<0 || idx>=q.size()){
      System.out.println("Invalid index");
      return-1;
    }
    for(int i=1;i<=idx;i++){
      q.add(q.remove());
    }
    int x= q.remove();
    for (int index = 1; index <=q.size()-idx; index++) { //new size se subtract krna hai because ek element is already removed
      q.add(q.remove());
    }
    return x;
  }

  static void addIndex(Queue<Integer> q, int idx, int val){//Using only Queue operations (add, remove, peek), insert at index 0.//Possible nahi hai without using extra space (another queue), kyunki Queue sirf rear insertion aur front deletion allow karti hai.
    if(idx<0 || idx>q.size()){
      System.out.println("Invalid index");
      return;
    }
    int n=q.size();
    for(int i=1;i<=idx;i++){
      q.add(q.remove());
    }
    q.add(val);
    for(int i=1;i<=n-idx;i++){
      q.add(q.remove());
    }
  }

    public static void display(Queue<Integer> q){
    int n= q.size();
    for(int i=1;i<=n;i++){
      System.out.print(q.peek()+" ");
      q.add(q.remove());
    }
    System.out.println();
  }
}