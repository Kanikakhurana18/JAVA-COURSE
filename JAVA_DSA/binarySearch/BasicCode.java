package binarySearch;//TC(O(logn)) used in sorted array

public class BasicCode {
  public static void main(String[] args) {
    int[] arr = { -76, 4, 9, 28, 47, 99 };// divinde in two parts leads to reduction of search space
    int target =99;
    int n = arr.length, low = 0, high = n - 1;
    boolean found= false;
    while (low <= high) {
      int mid = (low + high) / 2;//to avoid overflow use int mid = low + (high - low) / 2;
                                 //(2*low + (high - low)) / 2
      if (arr[mid] == target) {
        System.out.println("Found at index: "+ mid);
        found= true;
        break;
      }
      else if (arr[mid] < target) low = mid + 1;
      else  high = mid - 1; // arr[mid]>target
    }
    if(!found) System.out.println(-1);
  }
}
