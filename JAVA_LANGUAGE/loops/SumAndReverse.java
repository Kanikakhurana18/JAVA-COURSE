package loops;

import java.util.Scanner;

public class SumAndReverse {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();

    int sum=0;
    while(n!=0){
      sum+= n%10;
      n/=10;
    }
    System.out.println("Sum of the number is: "+sum);
    
    int r=0;
    while(sum!=0){
      r*=10;
      int a=sum%10;
      r+=a;
      sum/=10;
    }
    System.out.println("Reverse of number: "+r);
  }
}
