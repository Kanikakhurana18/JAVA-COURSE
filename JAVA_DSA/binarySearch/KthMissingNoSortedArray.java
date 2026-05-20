package binarySearch;

public class KthMissingNoSortedArray {
  public static int findKthPositive(int[] arr, int k) {
        int n= arr.length;
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int correctNo= mid+1;
            int missingNo= arr[mid]-correctNo;
            if(missingNo>=k) high=mid-1;
            else low=mid+1;
        }
     return low+k; //OR return high+k+1;
      }

      public static void main(String[] args) {
        int[] arr={3,5,6,7,8,11};
        int ans=findKthPositive(arr, 4);
        System.out.println(ans);
      }
}
