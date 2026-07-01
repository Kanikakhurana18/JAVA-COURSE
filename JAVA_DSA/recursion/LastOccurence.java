package recursion;

public class LastOccurence {
  public static void main(String[] args) {
    int[] arr={0,1,1,1,2,3,7,8,9};
    int tar=1;
    int n=arr.length;
    System.out.println(helper(arr, tar, 0, n-1, -1));
  }
  public static int helper(int[] arr, int tar,int low, int high,int idx){
    if(low>high) return idx;
    int mid=low+(high-low)/2;
    if(arr[mid]>tar) return helper(arr, tar, low, mid-1, idx);
    else if(arr[mid]<tar) return helper(arr, tar, mid+1, high, idx);
    else{
      idx=mid;
      return helper(arr, tar, mid+1, high, idx); //idx=mid as they are equal in above statement
    }
  }
}
