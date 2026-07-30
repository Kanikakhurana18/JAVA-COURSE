package stack;

import java.util.Stack;

public class TraverseTopToBottom { //TC= SC=O(n)
  public static void main(String[] args) {
    Stack<Integer> st= new Stack<>();
    Stack<Integer> st2= new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    if(st.isEmpty()) return;
    // while(st.size()>0){
    //   int top= st.pop();
    //   System.out.println(top);
    //   st2.push(top);
    // }
    // while(st2.size()>0){
    //   st2.push(st2.pop());
    // }

    //Now TO PRINT BOTTOM TO TOP
    while(st.size()>0){
      st2.push(st.pop());
    }
    while(st2.size()>0){
      int top= st2.pop();
      System.out.println(top);
      st.push(top);
    }
    //Calling the function using recursion
    // print(st);
    
  }
  //Using Recursion TC=SC=O(n)
  public static void print(Stack<Integer> st){
    if(st.isEmpty()) return;
    int x= st.pop();
    print(st);
    System.out.println(x);
    st.push(x);
  }
}
