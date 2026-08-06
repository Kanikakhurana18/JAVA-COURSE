package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindNegativeInWindowSizeK {
  public static void main(String[] args){
    int[] arr={-8, 2, 3, -6, 10};
    int k=2;
    System.out.println(firstNegInt(arr, k));
  }
   static List<Integer> firstNegInt(int arr[], int k) {
        //USING QUEUE O(n)
        List <Integer> ans= new ArrayList<>();
        int n=arr.length;
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0) q.add(i); //add all negative elem in queue
        }
        for(int i=0;i<n-k+1;i++){
            while(q.size()>0 && q.peek()<i) q.remove(); //not in window size or range
            if(q.size()>0 && q.peek()<=i+k-1) ans.add(arr[q.peek()]);
            else ans.add(0);
        }
        return ans;
        
        
        //BRUTE FORCE O(n-k+1)
        // List<Integer> ans= new ArrayList<>();
        // for(int i=0;i<=arr.length-k;i++){
        //     boolean found= false;
        //     for(int j=i;j<i+k;j++){
        //         if(arr[j]<0) {
        //             ans.add(arr[j]);
        //             found=true;
        //             break;
        //         }
        //     }
        //     if(!found) ans.add(0);
        // }
        // return ans;
    }
}
