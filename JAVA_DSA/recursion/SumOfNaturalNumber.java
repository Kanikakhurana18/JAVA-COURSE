package recursion;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n= sc.nextInt();
    System.out.println(findsum(n));
    }  
    public static int findsum(int n){
      if(n==1) return 1;
      return n+ findsum(n-1);
    }
}
