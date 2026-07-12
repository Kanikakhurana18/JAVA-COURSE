package cyclicSort;

import java.util.Arrays;

public class SetMismatch { //TC=O(n) and Sc=O(1)
  public static void main(String[] args) {
    int[] arr={1,2,2,4};
    int[] ans =findErrorNums(arr);
    for (int i : ans) {
      System.out.print(i+" ");
    }
    // System.out.println(Arrays.toString(findErrorNums(arr)));
  }
   public static int[] findErrorNums(int[] arr) {
        int i=0;
        // int[] ans = new int[2];
        int n=arr.length;
        while(i<n){
            int correctIdx= arr[i]-1;
            if(arr[i]==i+1 ||arr[correctIdx]==arr[i]) i++;
            else{
                swap(arr, i, correctIdx);
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1) return new int[]{arr[i], i+1};
        }
        return new int[]{-1,-1};
        //OR
        // for(i = 0; i < n; i++){
        //     if(arr[i] != i+1){
        //         ans[0] = arr[i];   // duplicate
        //         ans[1] = i+1;      // missing
        //         return ans;
        //     }
        // }
        // return ans;
    }
    public static void swap(int[] arr, int i, int idx){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}
