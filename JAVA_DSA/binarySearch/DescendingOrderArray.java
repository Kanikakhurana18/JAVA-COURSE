package binarySearch;

public class DescendingOrderArray {
  public static void main(String[] args) {
    int[] arr= {98,91,54,34,3,2,1};
    int tar=1;
    System.out.println(descendingBinary(arr,tar));
  }
  public static int descendingBinary(int[] arr, int tar){
    int low=0, high=arr.length-1;
    while(low<=high){
      int mid=low+(high-low)/2;
      if(arr[mid]>tar) low=mid+1;
      else if(arr[mid]<tar) high=mid-1;
      else return mid;
    }
    return-1;
  }
}
