package stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
  public static void main(String[] args){
    int[] arr={1, 3, 2, 4};
    System.out.println(nextLargerElement(arr));
  }
   public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n= arr.length;
        int[] nge= new int[n];
        nge[n-1]=-1;
        Stack<Integer> st= new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek()<=arr[i]) st.pop();
            if(st.size()==0) nge[i]=-1;
            else nge[i]=st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(nge[i]);
        }
        return ans;
        
        
        // Brute force tc=O(n^2) TLE
        // int n= arr.length;
        // int[] ans= new int[n];
        // for(int i=0;i<n;i++){
        //     ans[i]=-1; //default value
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             ans[i]= arr[j]; //array ke j mai se ans mai store karo
        //             break;
        //         }
        //     }
        // }
        // ArrayList<Integer> res= new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     res.add(ans[i]);
        // }
        // return res;

      }}