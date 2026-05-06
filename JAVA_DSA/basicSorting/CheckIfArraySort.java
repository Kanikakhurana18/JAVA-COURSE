package basicSorting;

import java.util.Scanner;

public class CheckIfArraySort {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n=sc.nextInt();
    int[] arr= new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Array elements are: ");
    for (int i : arr) {
      System.out.print(i+" ");
    }
    System.out.println();
    //check array sorted
    boolean isSorted = true;
    // for (int i = 1; i < arr.length; i++) {
    //   if(arr[i]<arr[i-1]){
    //     isSorted =false;
    //     break;
    // }}

    //OR
    for(int i=0;i<arr.length-1;i++){
      if(arr[i]>arr[i+1]){ //important to add curly brackets to check full loop
        isSorted= false;
        break;
      }
    }
    System.out.println(isSorted);
  }
}
