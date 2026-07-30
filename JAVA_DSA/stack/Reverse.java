package stack;

import java.util.ArrayList;
import java.util.Stack;

public class Reverse { //tc=O(n)
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    Stack<Integer> st3 = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    System.out.println(st);
    // using 2 empty stack[ st → st2 → st3 → st] //TC=O(n)
    while (!st.isEmpty()) {
      st2.push(st.pop());
    }
    while (!st2.isEmpty()) {
      st3.push(st2.pop());
    }
    while (!st3.isEmpty()) {
      st.push(st3.pop());
    }
    System.out.println(st);// Remember, Java prints bottom → top.

    // using ARRAYLIST [st → ArrayList → st] Tc=O(n)
    ArrayList<Integer> arr = new ArrayList<>();

    while (!st.isEmpty()) {
      arr.add(st.pop());
    }
    for (int i = 0; i < arr.size(); i++) {
      st.push(arr.get(i));
    }
    System.out.println(st);
  }
}
