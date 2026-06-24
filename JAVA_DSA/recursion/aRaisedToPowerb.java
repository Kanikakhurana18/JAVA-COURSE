package recursion;

import java.util.Scanner;

public class aRaisedToPowerb {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a= sc.nextInt();
    System.out.print("Enter first number: ");
    int b= sc.nextInt();
    // System.out.println(a+" raised to power "+b+" = " +Math.pow(a,b)); //USING BUILT-IN FUNCTION
    System.out.println(a+" raised to power "+b+" = " +pow(a,b)); //using recursive function
  }
  // public static int pow(int a, int b){ T.C O(b)
  //   if(b==0) return 1; //base case
  //   return a* pow(a,b-1);
  // }

  //Using Logarithmic Time complexity T.C =0(log b)
  public static int pow(int a, int b){
    if(b==0) return 1;
    int call= pow(a,b/2);
    if(b%2==0) return call*call; //power check krte that if it is even
    else return a*call*call; //if it is odd multiply by a
  }
}
