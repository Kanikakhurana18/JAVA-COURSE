package arrays;

import java.util.Arrays;

public class SortArray {
  public static void print(int[] brr){
    for(int i=0;i<brr.length;i++) System.out.print(brr[i]+" ");
  }
  public static void main(String[] args) {
    int[] arr={9,4,5,2,0,1,7};
    print(arr);
    System.out.println();
    // sort-> ascending order
    Arrays.sort(arr);
    print(arr);
    System.out.println();

    //reverse-> descending order
    for(int i=0;i<arr.length/2;i++){
      int temp=arr[i];
      arr[i]=arr[arr.length-1-i];
      arr[arr.length-1-i]=temp;
    }
    print(arr);
  }
}
