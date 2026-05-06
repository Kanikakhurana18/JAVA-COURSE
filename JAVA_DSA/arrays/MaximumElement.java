package arrays;

import java.util.Scanner;

public class MaximumElement {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n= sc.nextInt();
    int[] arr= new int[n];
    System.err.println("Enter array elements: ");
    for(int i=0;i<n;i++)
    arr[i] = sc.nextInt();
   
    int max=arr[0];
    for(int i=0;i<n;i++){
      if(max<arr[i]) max=arr[i];
      }
      System.out.println(max);
  }
}
