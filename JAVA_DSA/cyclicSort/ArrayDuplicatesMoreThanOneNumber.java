package cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class ArrayDuplicatesMoreThanOneNumber { //multiple number ke duplicates find ke liye cyclic sort
  public static void main(String[] args) {
    int[] arr={4,3,2,7,8,2,3,1};
    System.out.println(findDuplicates(arr));
  }
   public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans= new ArrayList<>();
        int n= arr.length;
        int i=0;
        while(i<n){
            int correctIdx= arr[i]-1;
            if(arr[i]==i+1 || arr[correctIdx]==arr[i]) i++; //Jis position par ye value honi chahiye, wahan pehle se hi wahi value padi hai
            else swap(arr,i, correctIdx);
        }
        for(i =0;i<arr.length;i++){
            if(arr[i]!=i+1) ans.add(arr[i]);
        }
        return ans;
    }
    public static void swap(int[] arr, int i, int idx){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}
