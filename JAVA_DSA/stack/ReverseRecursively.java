package stack;

import java.util.Stack;

public class ReverseRecursively { //TC=O(n^2)
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10); //bottom
    st.push(20);
    st.push(30); //top 
    System.out.println(st);
    reverse(st);
    System.out.println(st);
  }
  public static void reverse(Stack<Integer> st){
     if(st.size()==0) return;
    int top=st.pop();
    reverse(st);
    pushAtBottom(st,top);
  }
  public static void pushAtBottom(Stack<Integer> st, int ele){
    if(st.size()==0){
      st.push(ele);
      return;
    }
    int top=st.pop();
    pushAtBottom(st, ele);
    st.push(top);
  }
}
