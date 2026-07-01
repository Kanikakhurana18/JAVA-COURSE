package recursion;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n= sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.print(fibonacci(i) +" ");
    }
  }

    //Using recursion
    public static int fibonacci(int n){
      if(n==0|| n==1) return n; // if(n==0) return 0 || if(n==1) return 1
      return fibonacci(n-1) +fibonacci(n-2);
    }
    


    //Using Loop
    // int n= sc.nextInt();
    // int a=0;
    // int b=1;
    // for (int i = 0; i <n; i++) {
    //   System.out.print(a+" ");
    //   int c= a+b;
    //   a=b;
    //   b=c;
    // }
  // }
}
