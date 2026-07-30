package stack;

import java.util.Stack;

public class AddRemovePeekAnyPosition {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    int idx = 1;
    int val = 40;
    st.push(10);
    st.push(20);
    st.push(30);
    if (idx < 0 || idx >= st.size()) {
      System.out.println("Invalid Index");
      return;
    }
    // GET=peek
    while (st.size() > idx + 1) {
      st2.push(st.pop());
    }
    System.out.println(st.peek());
    // Restoring the stack agin in st1
    while (!st2.isEmpty()) {
      st.push(st2.pop());
    }

    System.out.println(st);

    // ADD=push
    while (st.size() > idx + 1) {
      st2.push(st.pop());
    }

    st.push(val);// idx yahan pe element ke baad insert karna hai

    while (!st2.isEmpty()) {
      st.push(st2.pop());
    }

    System.out.println(st);

    // Remove= pop
    while (st.size() > idx + 1) {
      st2.push(st.pop());
    }
    st.pop(); // element remove ho gya
    while (!st2.isEmpty()) {
      st.push(st2.pop());
    }

    System.out.println(st);
  }
}
