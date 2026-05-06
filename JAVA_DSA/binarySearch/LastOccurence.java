package binarySearch;

public class LastOccurence {
      public static int lastSearch(int[] arr, int tar) {
        int n= arr.length;
        int low=0, high=n-1,idx=-1;
        while(low<=high){
          int mid=(low+high)/2;
          if(arr[mid]<tar) low= mid+1;
          else if(arr[mid]>tar) high=mid-1;
          else{ //arr[mid]==tar
            idx=mid;
            low=mid+1;
          }
        }
        return idx;
    }
    public static void main(String[] args) {
      int[] arr= {1,1,1,9,10};
      int tar=1;
      System.out.println(lastSearch(arr,tar));
    }
}
