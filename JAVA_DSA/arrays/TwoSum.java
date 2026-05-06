package arrays;

import java.util.Arrays;

public class TwoSum {
  public static void main(String[] args) {
    int[] arr={1,23,445,67,67};
    int target=24;
    int n= arr.length;
    //Using sorting
    Arrays.sort(arr); //time complexity for sorting=O(nlogn)
    System.out.println();
    int i=0, j=arr.length-1;
    while(i<j){     //loop time complexity O(n) Total : O(nlogn)
      if(arr[i]+arr[j]==target) {
        System.out.println("True");
        return;} //return:= poora main method terminate kr deta hai
          //we use break when:=Jab loop se bahar aana ho but method continue karna ho
      else if(arr[i]+arr[j]>target){ 
        j--;
      }
      else{
         i++;   //arr[i]+arr[j]< target
      }
    }
     System.out.println("False");


    //or
    //this give time limit exceeded
    // boolean found=false;
    // for(int i=0;i<n;i++){
    //   for(int j=i+1;j<n;j++){
    //     if(arr[i]+arr[j]==sum){
    //       found=true;
    //       break; // inner loop(if wala) se bahar aane ke liye
    //     }
    //   }
    //   if(found) break; //outer loop(for[i] wala) se bahar aane ke liye
    // }
    // if(found) System.out.println("true");
    // else System.out.println("false");
  }
}
