package stack;

import java.util.Stack;

public class RemoveConsecutiveCharacters {
  public static void main(String[] args){
    String s=  "aabaa";
    System.out.println(removeDuplicates(s));
  }
   public static  String removeDuplicates(String s) { //Tc=O(n)
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(st.size()==0 || st.peek()!=ch) st.push(ch);
        }
        StringBuilder ans= new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();

         //Or Two Pointer
        // char[] arr=s.toCharArray();
        // int j=0;
        // for(int i=0;i<arr.length;i++){
        //     if(j==0 || arr[j-1]!=arr[i]){
        //         arr[j]=arr[i];
        //         j++;
        //     }
        // }
        // return new String(arr, 0 ,j);
        
        //Or USING STRING BUILDER
    //   StringBuilder ans = new StringBuilder();

    //     ans.append(s.charAt(0));

    //     for (int i = 1; i < s.length(); i++) {
    //         if (s.charAt(i) != s.charAt(i - 1)) {
    //             ans.append(s.charAt(i));
    //         }
    //     }

    //     return ans.toString();
}
}
