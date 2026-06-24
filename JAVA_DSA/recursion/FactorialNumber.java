package recursion;

import java.util.Scanner;

public class FactorialNumber { //factorial n= n*(n-1)fact
  public static int factorial(int n){
    if(n==0 || n==1) return 1; //or if(n <= 1) return 1;
    return n*factorial(n-1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n= sc.nextInt();
    System.out.println(factorial(n));
  }
}
