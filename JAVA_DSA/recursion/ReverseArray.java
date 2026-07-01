package recursion;

public class ReverseArray {
  public static void main(String[] args) {
     int[] arr = {10, 20, 30, 40, 50};
     reverse(arr, 0, arr.length-1);
     for (int i : arr) {
      System.out.print(i+" ");
     }
  }
  public static void reverse(int[] arr, int i, int j){
    if(i>=j) return ; //i > j → Code sahi chalega, lekin odd-length array mein middle element ek baar khud se swap hoga (extra operation)
    //swap
    int temp= arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    reverse(arr, i+1, j-1);
  }
}
