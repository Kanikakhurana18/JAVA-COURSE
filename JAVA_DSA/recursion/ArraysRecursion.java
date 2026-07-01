package recursion;

public class ArraysRecursion {
  //Print arrays fron first to last using recursion
  public static void main(String[] args) {
    int[] arr={5,3,6,7,99,9,3};
    int n= arr.length;
    // recursionPrint(arr, 0);//print first to last

    recursionPrint(arr, n-1); //print from last to first
  }
  // public static void recursionPrint(int[] arr, int idx){
  //   if(idx==arr.length) return;
  //   System.out.print(arr[idx]+" ");
  //   recursionPrint(arr, idx+1);
  // }

  //Print arrays fron first to last using recursion
  //  public static void recursionPrint(int[] arr, int idx){
  //   if(idx==arr.length) return;
  //   recursionPrint(arr, idx+1); //using callback
  //   System.out.print(arr[idx]+" ");
  //  }

    public static void recursionPrint(int[] arr, int idx){
    if(idx<0) return;
    System.out.print(arr[idx]+" ");
     recursionPrint(arr, idx-1);
   }
}
