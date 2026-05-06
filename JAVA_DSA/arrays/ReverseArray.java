package arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[] arr={6,7,8,9,5,0};
    int n=arr.length;
    // using for loop
    // for(int i=0;i<n/2;i++){
    //   int temp=arr[i];
    //   arr[i]= arr[n-i-1];
    //   arr[n-i-1]=temp;
    // }
    // for (int i : arr) {
    //   System.out.println(i);
    // }

    //using while loop-> alse helps in reversing part of array(subarray)
    int i=1,j=2; // revsre a part of array(subarray)
    while(i<j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;
    }
    for (int ele : arr) {
      System.out.println(ele);
    }

  }
}
