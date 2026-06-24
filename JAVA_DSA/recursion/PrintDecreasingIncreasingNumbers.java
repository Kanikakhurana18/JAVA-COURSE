package recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasingNumbers {
  // public static void print(int n){
    // if(n==0) return;
    // System.out.print(n+" "); // Before recursive call //5 4 3 2 1
    // print(n-1);
    // if(n!=1){ //Extra condition later
    // System.out.print(n+" "); // After recursive call //2 3 4 5 
    // }
  // }


  //OR BETTER RECURSION STYLE
  public static void print(int n){
    if(n==1){ //Yahan base case clearly kehta hai: "Jab problem size 1 reh jaye, answer print karo aur return kar do."
      System.out.print(1+" ");
      return;
    }
    System.out.print(n+" "); // Before recursive call //5 4 3 2 1 
    print(n-1);
    System.out.print(n+" ");//// After recursive call// 2 3 4 5
  }
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n= sc.nextInt();
    print(n);
  }
}
