package stack;

import java.util.Arrays;
import java.util.Stack;

public class NumbOfVisiblePeopleInQueue {
  public static void main(String[] args){
    int[] arr={10,6,8,5,11,9};
    int[] ans= canSeePersonsCount(arr);
    // for (int index = 0; index < arr.length; index++) { //SC=O(1) No extra space
    //   System.out.println(ans[index]);
    // } //OR
    System.out.println(Arrays.toString(ans)); //tc=SC=O(n) takes extra space
  }
    public static int[] canSeePersonsCount(int[] arr) {
        int n= arr.length;
        int[] ans= new int[n];
        Stack<Integer> st= new Stack<>();
        st.push(arr[n-1]);
        ans[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int count=0;
            while(st.size()>0 && st.peek()<=arr[i]){
                 st.pop();
                 count++;
            }
            if(st.size()>0) count++; // VImp khud hi next greater element ho jaye
            ans[i]=count;
            st.push(arr[i]);//Next count ke liye
        }
        return ans;
    }
}
