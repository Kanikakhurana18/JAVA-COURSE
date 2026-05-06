package arrays;

public class RotateArray {
  public static void main(String[] args) {
    int[] arr={1,4,5,6,7};
    int n=arr.length;
    int d=3;
    d%=n;
    // //left rotate
    // reverse(arr,0,d-1); //541  //54167
    // reverse(arr, d,n-1);  //76   //54176
    // reverse(arr, 0,n-1); //67145

    //right rotate
    reverse(arr, 0, n-1); //76541
    reverse(arr, 0, d-1); //567 //56741 
    reverse(arr, d, n-1); //14 
    for (int i : arr) {  
      System.out.print(i);   //56714
    }
  }
  public static void reverse(int[] arr,int i,int j){
    while(i<j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
    }
  }
}
