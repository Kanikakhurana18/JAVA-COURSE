package loops;

import java.util.Scanner;

public class PalindromeNum {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int dup=x;
        int rev=0;
        if(x<0){
        System.out.println("No palindrome");
        return;}

        while(x!=0){
          rev*=10;
          rev+=(x%10);
          x/=10;
        }
        if(rev==dup) System.out.println("yes, it is palindrome");
        else System.out.println("no, it is not palindrome");
  }
}
