package recursion;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {0,54,67,87,99}; //ascending order mai sorted
    int tar=99;
    System.out.println(search(arr, tar));
  }
  public static int search(int[] nums, int tar) {
        //Using recursion
        int n= nums.length;
        return helper(nums,tar, 0, n-1);
    }
    public static int helper(int[] nums, int tar, int low, int high){
        if(low>high) return -1;
        int mid= low+(high-low)/2;
        if(nums[mid]==tar) return mid;
        else if(nums[mid]>tar) return helper(nums, tar, low, mid-1);
        else return helper(nums, tar, mid+1, high);
    }
}
