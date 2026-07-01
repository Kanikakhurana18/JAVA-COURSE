package recursion;

import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int m= sc.nextInt();
    System.out.print("Enter second number: ");
    int n= sc.nextInt();
    System.out.println(gcd(m, n));
    
  }
  //Using recursion TC=O(log(min(a,b))) and SC=O(log(min(a,b)))
   public static int gcd(int a, int b){
    // public static int helper(int a, int b) {
        if(a==0) return b;
        return gcd(b%a, a);
    }
    // public static int gcd(int a, int b){
    //     return helper(Math.min(a,b),Math.max(a,b));
    // }


    //using iteration isme Space Complexity=O(1)
    // while(a != 0){
    // int temp = a;
    // a = b % a;
    // b = temp;
    // }
    // return b;



  //Using for loop
    // public static int gcd(int m, int n){
    //   int hcf=1;
    //   for(int i=2;i<=Math.min(m,n);i++){
    //     if(m%i==0 && n%i==0) hcf=i;
    //   }
    //   return hcf;
    // }

}
