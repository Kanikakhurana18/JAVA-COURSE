package stack;

import java.util.Stack;

public class ParenthesisChecker {
  public static void main(String[] args) {
    String s="[()()]{}";
    System.out.println(isValid(s));
  }
   public static boolean isValid(String s) {
       int n= s.length();
       if(n%2==1) return false; //odd number ke brackets check kr rha hai
       Stack<Character> st= new Stack<>();
       for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        if(ch=='(' || ch=='{' || ch=='[') {st.push(ch);
       }
       else{ //ch closing bracket hua to
        if(st.size()==0) return false;
        char top= st.peek(); //opening bracket
        if(sametype(top,ch)) st.pop();
        else return false;
       }
    }
    return st.size()==0;
    }
    public static boolean sametype(char a , char b){
        if(a=='(' && b==')') return true;
        if(a=='{' && b=='}') return true;
        if(a=='[' && b==']') return true;
        return false;
    }
}
