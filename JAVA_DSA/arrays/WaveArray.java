package arrays;

import java.util.Arrays;

public class WaveArray {
  public static void main(String[] args) {
    int[] arr={1,4,5,6,7,3,2};
    int n=arr.length;
    for(int i=0;i<n-1;i+=2){
      int temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
      }
      System.out.print(Arrays.toString(arr));
  }
}
