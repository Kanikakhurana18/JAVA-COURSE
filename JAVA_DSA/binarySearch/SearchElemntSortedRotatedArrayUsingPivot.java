package binarySearch;
public class SearchElemntSortedRotatedArrayUsingPivot {
  //TC=2*O(logn)= O(logn)
  //Find pivot- smallest element jahan se rotation start hua hai
  public static int findPivot(int[] arr){
    int low=0, high=arr.length-1;
    while (low<high) {
      int mid=(low+high)/2;
      if(arr[mid]>arr[high]) low=mid+1; //isme high se compare becoz pivot small hai then high
      else high=mid; //not mid-1 as pivot can include mid too
    }
    return low;
  }

  //binary search
  public static int BS(int[] arr, int tar,int low,int high){
    while(low<=high){
      int mid= (low+high)/2;
      if(arr[mid]==tar) return mid;
      else if(arr[mid]<tar) low=mid+1; //move towards target
      else high=mid-1;
    }
    return -1;
  }

  //Main search 
  public static int search(int[] arr, int tar){
    int n=arr.length;
    //find pivot
    int pivot= findPivot(arr);

    //decide which side to search
    if(tar>=arr[pivot]&& tar<=arr[n-1]) return BS(arr, tar, pivot, n-1); //right side
    else return BS(arr, tar,0, pivot-1); //left side
  }

  public static void main(String[] args) {
    int[] arr = {4,5,6,7,0,1,2};
    int target = 2;
    System.out.println(search(arr, target));
}

}
