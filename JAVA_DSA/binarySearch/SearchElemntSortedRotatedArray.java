package binarySearch;

public class SearchElemntSortedRotatedArray {
  public static void main(String[] args) {
    //find which is sorted half - left or right?
  int[] arr={4,5,6,7,8,1,2};
  int tar=5;
  int low=0, high=arr.length-1;
  while(low<=high){
    int mid= (low+high)/2;
    if(arr[mid]==tar){
       System.out.println(mid);
       return; //no break as -1 still print hoga //as void cannot return anything so we have to write only return
    }
    else if(arr[low]<=arr[mid]){ //bw low and mid sorted
      if(arr[low]<=tar && tar<=arr[mid]) high=mid-1;
      else low=mid+1;
    }
    
    else{ //mid to high sort
      if(arr[mid]<=tar && tar<=arr[high]) low=mid+1;
      else high=mid-1;
    }
  }
  System.out.println("-1");
  }
  
}
