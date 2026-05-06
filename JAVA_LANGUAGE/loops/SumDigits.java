package loops;

import java.util.Scanner;

public class SumDigits {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;

    while(n!=0){
      // int digit=n%10;
      // sum=sum+digit;
      sum+= n%10;
      n/=10;
      sum =sum > 0 ? sum: -sum;
    }
    System.out.println(sum);
  }
}
