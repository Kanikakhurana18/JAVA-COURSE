package loops;

import java.util.Scanner;

public class PrimeNo {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();

   boolean flag=true; // true means prime no always opp assume krte hai 
  // //for (int i =2; i<=n-1; i++)
  // //for (int i=2; i<=Math.sqrt(n)) 
  for (int i=2;i*i<=n; i++)
  {
    if(n%i==0){
    flag= false;  //false means composite
    break;}
  }
  if(n==1) System.out.println("Neither prime nor false");
    else if(flag==false) System.out.println("Composite no");
    else System.out.println("Prime no ");
  

  // int cnt = 0;  // Initialize a counter variable to count the number of factors

  //       for (int i = 1; i*i <=n; i++) {
  //           if (n % i == 0) {
  //               cnt++;  
  //               if (n / i != i) {
  //                   cnt++;
  //               }
  //           }
  //       }
  //         if (cnt==2) {
  //           System.out.println(n + " is a prime number.");
  //       } else {
  //           System.out.println(n + " is not a prime number.");
  //       }
}
}
