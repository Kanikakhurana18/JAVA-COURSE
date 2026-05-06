package basicSorting;

import java.util.Arrays;

public class TwoSumUsingSorting {
  public static void main(String[] args) {
    int[] arr={7,0,4,3,2,8};
    int target=9;
    Arrays.sort(arr); //time complexity for sorting=O(nlogn)
    print(arr);
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
   }
   public static void print(int[] arr){
    for(int ele: arr){
      System.out.print(ele+" ");
    }
  }
}
