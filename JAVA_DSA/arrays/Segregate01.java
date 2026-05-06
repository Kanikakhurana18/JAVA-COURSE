package arrays;

import java.util.Arrays;

public class Segregate01 {
  public static void main(String[] args) {
    int[] arr={0,1,0,1,0,0,1,1};
    // int noofzeroes =0;
    // int noofones=0;
    // for (int ele : arr) {
    //   if(ele==0) noofzeroes++;
    //   else noofones++;
    // }
    // for(int i=0;i<noofzeroes;i++){
    //   arr[i]=0;
    // }
    // for (int j = noofzeroes; j < arr.length; j++) {
    //   arr[j]=1;
    // }
     
    //   System.out.print(Arrays.toString(arr));  //to print array

    int n=arr.length;
    int i=0;
    int j=n-1;
    while(i<j){
      if(arr[i]==0) i++;
      else if(arr[j]==1) j--;
      else if(arr[i]==1 && arr[j]==0){
        arr[i]=0;
        arr[j]=1;
        i++;
        j--;
      }
    }
     System.out.print(Arrays.toString(arr));  //to print array
  }
}
