package loops;

import java.util.Scanner;

public class ArmstrongNumber //is a positive integer equal to the sum of its own digits,
//  each raised to the power of the total number of digits
//eg- 153 power of 3 add to digits = 153
//1634 power of 4 add to didgits give itself.
{
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k= String.valueOf(n).length();
        int sum=0;
        int num=n;
        
        while(n!=0){
            int ld=n%10;
            sum+=Math.pow(ld,k);
            n/=10;
        }
        if(sum==num) System.out.println("true"); 
        else System.out.println("false");
  }
}
