package binarySearch;

public class MaxPositiveNegativeInt {
  public static void main(String[] args) {
    int[] arr={-3,-2,-1,0,0,1,2};
    int ans =maximumCount(arr);
    System.out.println(ans);
  }

  public static int maximumCount(int[] arr) {
        int low=0, high=arr.length-1, n=arr.length;
        int negcount=0, poscount=0; //max of [0,0] will be 0
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=0) high=mid-1;
            else {
                low=mid+1;
            }
            }
            negcount=low;

             low=0; //reset value so no int and in differ line with ;
             high=n-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]<=0) low=mid+1;
            else{
                high=mid-1;
            }
        }
        poscount=n-low;
        return Math.max(poscount,negcount);
    }
}
