package binarySearch;

public class PeakInMountainArray {
  public static void main(String[] args) {
    int[] arr={-1,0,1,2,4,5,6,8,3,2,1};
    // int low=1, high= arr.length-2;
    // boolean found = false;
    // while(low<=high){
    //   int mid=low+(high-low)/2;
    //   if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]) {
    //     System.out.println("Index of peak element is: "+mid);
    //     found=true;
    //     break;
    //   }
    //   else if(arr[mid]>arr[mid+1]&& arr[mid]<arr[mid-1]) high=mid-1;
    //   else low=mid+1;
    // }
    // if(!found) System.out.println("-1");

    
    //OR
    int low=0,high= arr.length-1;
    while(low<high){    //yahan pe not= sign
      int mid=(low+high)/2;
      if(arr[mid]<arr[mid+1]) low=mid+1;
      else high=mid;
    }
    System.out.println("Index of peak element is: "+low);  //As low=high

  }
}
