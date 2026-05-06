package binarySearch;

public class FloorInSortedArray {
  public static void main(String[] args) {
    int[] arr={-1,0,1,2,4,5,6,8}; //sorted array
    int x=-5;
    int idx=-1;
    int low=0, high=arr.length-1;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]> x) high=mid-1;
      else{
        idx=mid;
        low=mid+1;
      }
    }
    System.out.println(idx); //floor mai less than and equal to hota hai
  }
}
