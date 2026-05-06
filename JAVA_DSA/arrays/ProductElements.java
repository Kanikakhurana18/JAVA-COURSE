package arrays;

import java.util.Scanner;

public class ProductElements {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n= sc.nextInt();
    int[] arr= new int[n];
    System.err.println("Enter array elements: ");
    for(int i=0;i<n;i++)
    arr[i] = sc.nextInt();

    int pr=1;
    for(int i=0;i<n;i++){
      pr*=arr[i];
    }
    System.out.println(pr);
  }
}
