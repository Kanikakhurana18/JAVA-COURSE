package recursion;

import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n= sc.nextInt();
    System.out.println(reverse(n,0));
  }
  // public static void reverse(int n){
  //   if(n==0) return ;
  //   System.out.print(n%10);
  //   reverse(n/10);
  // }
  public static int reverse(int n, int rev){
    if(n == 0) return rev;
    return reverse(n / 10, rev * 10 + n % 10);
}
}
