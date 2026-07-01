package recursion;

import java.util.Scanner;

public class PowerOfNumbers {
  public static int reverseExponentiation(int n) {
        if(n==10) return n;
        return pow(n,n);
        
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        int call= pow(a,b/2);
        if(b%2==0) return call*call;
        else return call*call*a;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n= sc.nextInt();
    System.out.println(reverseExponentiation(n));
    }
}
