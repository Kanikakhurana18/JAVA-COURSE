package cyclicSort;

public class BasicCode{
  public static void main(String[] args) {
    int[] arr={9,8,7,6,5,4,3,2,1};
    int i=0;
    while(i<arr.length){
      int correct= arr[i]-1; //array 1 se n tak hai. [Agar array 0 se n-1 hota then int correct = arr[i];]
      if(arr[i]==arr[correct]) i++;
      else swap(arr, i, correct);
    }
    for( i=0;i<arr.length;i++){}
    for (int j : arr) {
      System.out.print(j+" ");
    }
  }
  public static void swap(int[] arr, int i, int j){
    int temp=arr[i];
    arr[i]= arr[j];
    arr[j]=temp;
  }

  }
