package arrays;

import java.util.Scanner;

public class NegativeElements {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n= sc.nextInt();
    int[] arr= new int[n];
    System.out.println("Enter array elements: ");
    for(int i=0;i<n;i++)
    arr[i] = sc.nextInt();
    //output
    boolean found= false; //case sensitive
    System.out.print("Negative elements: ");
    for(int i=0;i<n;i++){
      if(arr[i]<0) {
        found=true;
        System.out.print(arr[i]+" ");
      }
    }
     
    if(!found)System.out.println("no negative elements"); //found == false //case sensitive false and true
}
}
