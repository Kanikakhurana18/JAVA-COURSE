package arrays;
import java.util.Arrays;

public class ShallowCopyDeepCopy {
  public static void main(String[] args) {
    int[] arr ={1,22,3,4,5};
    int[]x =arr;
    x[0]= 100;
    System.out.println(arr[0]);  //shallow copy-> changes the value
    
    //reset array
    arr[0]=1;

    //deep copy-> value new create in memory so no change
    int[] deep=Arrays.copyOf(arr,arr.length);
    deep[0]=200;
    System.out.println(arr[0]);
    System.out.println(deep[0]);
  }
}
