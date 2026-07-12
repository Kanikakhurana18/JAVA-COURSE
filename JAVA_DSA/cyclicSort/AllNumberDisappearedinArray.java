package cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class AllNumberDisappearedinArray {
  public static void main(String[] args) {
    int[] arr={4,3,2,7,8,2,3,1};
    System.out.println(findDisappearedNumbers(arr));
  }
  public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int i=0;
        int n = arr.length;
        while(i<n){
            int correctIdx=arr[i]-1;
            if(arr[i]==i+1 || arr[correctIdx]==arr[i]) i++;
            else swap(arr, i, correctIdx); 
        }
        for(i =0;i<arr.length;i++){
            if(arr[i]!=i+1) ans.add(i+1);
        }
        return ans;
    }
     public static void swap(int[] arr, int i, int idx){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}
