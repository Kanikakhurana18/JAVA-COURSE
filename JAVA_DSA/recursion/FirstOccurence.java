package recursion;

public class FirstOccurence {
  public static void main(String[] args) {
    int[] arr={0,1,1,1,2,3,7,8,9};
    int k=1;
    System.out.println(firstSearch(arr, k));
  }
  // using recursion
  public static int firstSearch(int[] arr, int k) {
        int n=arr.length;
        return helper(arr, k,0, n-1,-1);
        
    }
    public static int helper(int[] arr, int tar, int low, int high, int idx){
        if(low>high) return idx;
        int mid=low+(high-low)/2;
        if(arr[mid]>tar) return helper(arr, tar, low, mid-1,idx);
        else if(arr[mid]<tar) return helper(arr, tar, mid+1, high, idx);
        else{
            idx=mid;
            return helper(arr, tar, low, mid-1,idx); //idx=mid bhi likh skte hai beacuse same hai idx=mid
        }
    }
}
