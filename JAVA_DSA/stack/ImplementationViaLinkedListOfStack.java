package stack;

class Node{
  int val;
  Node next;
  Node(int val){
    this.val=val;
  }
}
class MyStack{
  Node head;
  int length;

  int peek() throws Exception{
    if(head==null){
      throw new Exception("Stack underflow");
    }
    return head.val;
  }

  int pop() throws Exception{ //delete at head
    if(head==null){
      throw new Exception("Stack underflow");
    }
    int x= head.val;
    head=head.next;
    length--;
    return x;
  }

  void push(int ele){ //add at head
    Node temp= new Node(ele);
    if(length==0) head= temp;
    else{
      temp.next=head;
      head=temp;
    }
    length++;
  }

  int size(){
    return length;
  }

  void display(){ //This does not takes extra space as we are using ll as built in method of syso takes extra o(n) space
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp=temp.next;
    }
    System.out.println();
  }
}
public class ImplementationViaLinkedListOfStack  {
  public static void main(String[] args) throws Exception {
    MyStack st= new MyStack();
    // st.peek(); //This will print the exception and return the function
    st.push(10); st.push(20); st.push(30);
    st.display();
    st.pop();
    st.display();
    System.out.println(st.peek());
    System.out.println(st.length);
  }
}
