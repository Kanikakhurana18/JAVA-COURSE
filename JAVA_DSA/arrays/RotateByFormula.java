package arrays;

public class RotateByFormula {
  public static void main(String[] args) {
    int[] arr={8,6,4,5,9,3};
    int n=arr.length;
    // if +k ==right rotate  (i + k) % n
    //if -k == left rotate   (i - k + n) % n;
    int k=3;
    k%=n;
    int temp[] =new int[n];
    for(int i=0;i<n;i++){
      temp[(i+k)%n]=arr[i];   //cyclic way mai kth position pe shift kr dega
    }

    //copy
    for(int i=0;i<n;i++){
      arr[i]=temp[i];
    }
    for(int i=0;i<n;i++){
      System.out.print(arr[i]); //593864
    }
  }
}
