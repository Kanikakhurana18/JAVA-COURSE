package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
  public static void main(String[] args) {
    int[] arr={2,3};
    System.out.println(subsetSums(arr));
  }
  public static ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> ans= new ArrayList<Integer>();
        helper(arr,0,0,ans);
        Collections.sort(ans);
        return ans;
    }
    public static void helper(int[] arr, int idx, int sum, ArrayList<Integer> ans){
        if(idx==arr.length){
            ans.add(sum);
            return;
        }
        helper(arr, idx+1, sum+arr[idx],ans); //pick
        helper(arr, idx+1, sum, ans); //skip
    }
}
