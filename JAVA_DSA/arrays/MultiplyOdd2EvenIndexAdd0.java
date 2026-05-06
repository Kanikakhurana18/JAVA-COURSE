package arrays;

public class MultiplyOdd2EvenIndexAdd0 {
  public static void main(String[] args) {
    int[] arr={1,3,4,5,6,7};
    // print the array
    // for(int i=0;i<arr.length;i++){
    //   if(i%2!=0)System.out.print(2*arr[i]+" ");
    //   else System.out.print(arr[i]+0+" ");
    // }

    // modify/upadte the array
    for(int i=0;i<arr.length;i++)
      if(i % 2 != 0) {   // odd index
        arr[i] = arr[i] * 2;
      } 
      else {             // even index
        arr[i] = arr[i] + 0; 
      }
       for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " "); // now print
    }
  }
}
