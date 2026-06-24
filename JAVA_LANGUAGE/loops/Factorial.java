package loops;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();

    int fact=1;
    for(int i=1;i<=n;i++){ //not i=0 as 0 ko multiply karte hi i se sab kuch 0 ho jata hai.
      fact*=i;
    }
    System.out.println(fact);

  }
}
