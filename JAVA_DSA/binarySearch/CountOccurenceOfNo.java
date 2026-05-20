package binarySearch;

public class CountOccurenceOfNo { //count=last-first+1;()
  public static void main(String[] args) {
    int[] arr={1,2,2,2,3,3,4,5,6};
    int tar=2;
    int count=0;
    int first= firstOccurence(arr,tar);
    int last= lastOccurence(arr,tar);
    if(first != -1)
            count = last - first + 1;
        else
            count = 0;
    System.out.println(count);
  }

  public static int firstOccurence(int[]arr, int tar){
    int low=0, high= arr.length-1, idx=-1;
    int count=0;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]<tar) low= mid+1;
      else if(arr[mid]>tar) high= mid-1;
      else { //arr[mid]==tar
          idx=mid;
          high=mid-1; //left
      }
    }
    return idx;
  }

   public static int lastOccurence(int[]arr, int tar){
    int low=0, high= arr.length-1, idx=-1;
    int count=0;
    while(low<=high){
      int mid=(low+high)/2;
      if(arr[mid]<tar) low= mid+1;
      else if(arr[mid]>tar) high= mid-1;
      else { //arr[mid]==tar
          idx=mid;
          low=mid+1; //right
      }
    }
    return idx;
  }
}
