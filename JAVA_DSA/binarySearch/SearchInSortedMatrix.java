package binarySearch;

public class SearchInSortedMatrix {
  public static void main(String[] args) {
    int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target=60;
     int row= arr.length, cols= arr[0].length;
        int low=0, high= row*cols-1;//2d array
        while(low<=high){
            int mid=(low+high)/2;
            int midRow= mid/cols;
            int midCol= mid%cols;
            if(arr[midRow][midCol]==target){
               System.out.println("true");
               return;
            }
            else if(arr[midRow][midCol]>target) high=mid-1;
            else low=mid+1;
        }
        System.out.println("false");
  }
}
