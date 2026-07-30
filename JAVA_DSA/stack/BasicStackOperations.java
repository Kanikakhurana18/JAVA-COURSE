package stack;
import java.util.*;

public class BasicStackOperations{
  public static void main(String[] args) {
    Stack<Integer> st= new Stack<>();
    //add
    st.push(10);
    st.push(20);
    st.push(30);
    
    //To print top element
    System.out.println(st.peek());

    //full stack print Auxilary space=O(n) because you must visit every single item to read and output it, and a stack only lets you look at the top element at a time
    System.out.println(st);

    //removes the top element and return it
    st.pop(); //removes 30

    //give the size of stack
    System.out.println(st.size());

    //removes and return the top element as it also stores it
    System.out.println(st.pop());

    //print full stack
    System.out.println(st);
  }
  }